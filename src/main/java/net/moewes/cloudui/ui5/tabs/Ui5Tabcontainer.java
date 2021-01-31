package net.moewes.cloudui.ui5.tabs;

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
 * Java wrapper for UI5 web component ui5-tabcontainer
 */
public class Ui5Tabcontainer extends UiComponent {

    private boolean fixed;
    private boolean collapsed;
    private boolean showOverflow;

    /**
     * default constructor
     */
    public Ui5Tabcontainer() {
        super("ui5-tabcontainer");
    }

    /**
     * sets the fixed attribute of ui5-tabcontainer
     *
     * @param fixed flag
     */
    public void setFixed(boolean fixed) {
        this.fixed = fixed;
    }

    /**
     * collapse the tab container
     */
    public void collapse() {
        this.collapsed = true;
    }

    /**
     * sets the show-overflow attribute of ui5-tabcontainer
     *
     * @param showOverflow flag
     */
    public void showOverflow(boolean showOverflow) {
        this.showOverflow = showOverflow;
    }

    /**
     * sets the tab-layout attribute of ui5-tabcontainer
     *
     * @param layout value
     */
    public void setTabLayout(TabLayout layout) {
        getElement().setAttribute("tab-layout", layout.getAttributeText());
    }

    /**
     * sets the tab-placement attribute of ui5-tabcontainer
     *
     * @param placement value
     */
    public void setTabPlacement(TabPlacement placement) {
        getElement().setAttribute("tabs-placement", placement.getAttributeText());
    }

    @Override
    public void addEventListener(String event, Consumer<UiEvent> function) {

        registerEvenrHandler(function, UiEventDefinition.builder().eventName(event)
                .attributeMappings(Arrays.asList(
                        UiEventAttributeMapping.builder().fieldName("tab").isHtmlElement(true).build()))
                .build());
    }

    @Override
    public UiElement render() {
        if (collapsed) {
            getElement().setAttribute("collapsed", "true");
        }
        if (fixed) {
            getElement().setAttribute("fixed", "true");
        }
        if (showOverflow) {
            getElement().setAttribute("show-overflow", "true");
        }
        return super.render();
    }

    /**
     * possible values for attribute tab-layout
     */
    @AllArgsConstructor
    @Getter
    public enum TabLayout {
        STANDARD("Standard"),
        INLINE("Inline");

        private final String attributeText;
    }

    /**
     * possible values for attribute tab-placement
     */
    @AllArgsConstructor
    @Getter
    public enum TabPlacement {
        TOP("Top"),
        BOTTOM("Bottom");

        private final String attributeText;
    }
}
