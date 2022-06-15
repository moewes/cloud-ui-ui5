package net.moewes.cloudui.ui5.table;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;

import lombok.AllArgsConstructor;
import lombok.Data;
import net.moewes.cloudui.UiComponent;
import net.moewes.cloudui.UiElement;
import net.moewes.cloudui.UiEvent;
import net.moewes.cloudui.UiEventAttributeMapping;
import net.moewes.cloudui.UiEventDefinition;

public class Ui5Table<model> extends UiComponent {

    @Data
    @AllArgsConstructor
    private class Column<model> {
        private Ui5TableColumn columnComponent;
        private Function<model, ?> getter;
    }

    private List<Column> columns = new ArrayList<>();

    private Function<model, String> idGetter;

    private Collection<model> items = new ArrayList<>();

    public Ui5Table() {
        super("ui5-table");
    }

    public void addColumn(String title, Function<model, ?> getter) {
        columns.add(new Column<model>(new Ui5TableColumn(title), getter));
    }

    public void setItems(Collection<model> items) {
        this.items = items;
    }

    @Override
    public UiElement render() {

        getElement().setAttribute("mode","SingleSelect");
        columns.forEach(column -> {
            column.getColumnComponent().getElement().setAttribute("slot", "columns");
            add(column.getColumnComponent());
        });

        items.forEach(item -> {
            Ui5TableRow row = new Ui5TableRow();
            row.getElement().setAttribute("type","Active");
            add(row);
            idGetter().ifPresent(modelStringFunction -> row.setId(modelStringFunction.apply(item)));
            columns.forEach(column -> {
                Ui5TableCell cell = new Ui5TableCell();
                row.add(cell);
                cell.setInnerHtml(column.getGetter().apply(item).toString());
            });
        });

        return super.render();
    }

    @Override
    public void addEventListener(String event, Consumer<UiEvent> function) {

        if ("row-click".equals(event)) {
            registerEvenrHandler(function, UiEventDefinition.builder().eventName(event)
                    .attributeMappings(Arrays.asList(
                            UiEventAttributeMapping.builder().fieldName("row").isHtmlElement(true).build()))
                    .build());
        } else {
            super.addEventListener(event, function);
        }
    }

    public void setIdGetter(Function<model, String> getter) {
        this.idGetter = getter;
    }

    private Optional<Function<model, String>> idGetter() {
        return Optional.ofNullable(idGetter);
    }
}
