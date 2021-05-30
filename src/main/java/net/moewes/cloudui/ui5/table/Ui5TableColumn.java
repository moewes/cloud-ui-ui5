package net.moewes.cloudui.ui5.table;

import net.moewes.cloudui.UiComponent;

public class Ui5TableColumn extends UiComponent {

    public Ui5TableColumn() {
        super("ui5-table-column");
    }

    public Ui5TableColumn(String header) {
        this();
        getElement().setInnerHtml(header);
    }
}
