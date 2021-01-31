package net.moewes.cloudui.ui5.list;

import java.util.Arrays;
import java.util.function.Consumer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import net.moewes.cloudui.UiComponent;
import net.moewes.cloudui.UiElement;
import net.moewes.cloudui.UiEvent;
import net.moewes.cloudui.UiEventAttributeMapping;
import net.moewes.cloudui.UiEventDefinition;

/**
 * Java wrapper for UI5 web component ui5-list
 */
public class Ui5List extends UiComponent {

    private boolean inset;

    /**
     * default constructor
     */
    public Ui5List() {
        super("ui5-list");
    }

    /**
     * sets the header text of the list
     *
     * @param headerText text that is diplayed in the list header
     */
    public void setHeaderText(String headerText) {
        getElement().setAttribute("header-text", headerText);
    }

    /**
     * sets the footer of the list
     *
     * @param footerText text that is displayed as footer
     */
    public void setFooterText(String footerText) {
        getElement().setAttribute("footer-text", footerText);
    }

    /**
     * sets inset attribute of ui5-list
     *
     * @param inset flag
     */
    public void setInset(boolean inset) {
        this.inset = inset;
    }

    /**
     * sets attribute no-data-text of ui5-list
     *
     * @param text text that is displayed when there no list items
     */
    public void setNoDataText(String text) {
        getElement().setAttribute("no-data-text", text);
    }

    /**
     * sets attribute mode of ui5-list
     *
     * @param mode value
     */
    public void setMode(Mode mode) {
        getElement().setAttribute("mode", mode.getAttributeText());
    }

    /**
     * sets attribute separator of ui5-list
     *
     * @param separators value
     */
    public void setSeparators(Separators separators) {
        getElement().setAttribute("separators", separators.getAttributeText());
    }

    /**
     * adds a component to the header of the list. In this case the headerText is ignored
     *
     * @param component component to add
     */
    public void addHeader(UiComponent component) {
        component.getElement().setAttribute("slot", "header");
        add(component);
    }

    @Override
    public void addEventListener(String event, Consumer<UiEvent> function) {

        if ("item-delete".equals(event)) {
            registerEvenrHandler(function, UiEventDefinition.builder().eventName(event)
                    .attributeMappings(Arrays.asList(
                            UiEventAttributeMapping.builder().fieldName("item").isHtmlElement(true).build()))
                    .build());
        } else if ("item-click".equals(event)) {
            registerEvenrHandler(function, UiEventDefinition.builder().eventName(event)
                    .attributeMappings(Arrays.asList(
                            UiEventAttributeMapping.builder().fieldName("item").isHtmlElement(true).build()))
                    .build());
        } else {
            super.addEventListener(event, function);
        }
        // TODO MultiSelect Event
    }

    @Override
    public UiElement render() {
        if (inset) {
            getElement().setAttribute("inset", "true");
        }
        return super.render();
    }

    /**
     * possible values for attribute mode of ui5-list
     */
    @AllArgsConstructor
    @Getter
    public enum Mode {
        NONE("None"),
        SINGLE_SELECT("SingleSelect"),
        SINGLE_SELECT_BEGIN("SingleSelectBegin"),
        SINGLE_SELECT_END("SingleSelectEnd"),
        MULTISELECT("MultiSelect"),
        DELETE("Delete");

        private final String attributeText;
    }

    /**
     * possible values for attribute separators of ui5-list
     */
    @AllArgsConstructor
    @Getter
    public enum Separators {
        ALL("All"),
        INNER("Inner"),
        NONE("None");

        private final String attributeText;
    }
}
