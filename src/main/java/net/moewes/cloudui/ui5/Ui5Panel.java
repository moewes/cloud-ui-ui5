package net.moewes.cloudui.ui5;

import java.util.Arrays;

import lombok.AllArgsConstructor;
import lombok.Getter;
import net.moewes.cloudui.UiComponent;

/**
 * Java wrapper for UI5 web component ui5-panel
 */
public class Ui5Panel extends UiComponent {

    /**
     * default constructor
     */
    public Ui5Panel() {
        super("ui5-panel");
    }

    /**
     * constructor
     *
     * @param headerText text that is displayed as header of panel
     * @param fixed      if true the panel cannot be collapsed
     */
    public Ui5Panel(String headerText, boolean fixed) {
        this();
        setHeaderText(headerText);
        setFixed(fixed);
    }

    /**
     * sets the header-text attribute of ui5-panel
     *
     * @param text text that is displayed as header of panel
     */
    public void setHeaderText(String text) {
        getElement().setAttribute("header-text", text);
    }

    /**
     * sets the header-level attribute of ui5-panel
     *
     * @param level level for the headerText
     */
    public void setHeaderLevel(Ui5Title.Level level) {
        getElement().setAttribute("header-level", level.name());
    }

    /**
     * sets if the panel can be collapsed
     *
     * @param fixed when true the panel cannot be collapsed
     */
    public void setFixed(boolean fixed) {
        if (fixed) {
            getElement().setAttribute("fixed", "true");
        }
    }

    /**
     * sets whether the panel is collapsed or not
     * Only useful if the panel is not fiexed
     *
     * @param collapsed true if the panel should initial be collapsed
     */
    public void setCollapsed(boolean collapsed) {
        if (collapsed) {
            getElement().setAttribute("collapsed", "true");
        }
    }

    /**
     * sets the accessible-role of ui5-panel
     *
     * @param role see enum
     */
    public void setAccessibleRole(AccessibleRole role) {
        getElement().setAttribute("accessible-role", role.getText());
    }

    /**
     * adds multiple elements to the header of the panel
     *
     * @param headerComponents one or more components to add
     */
    public void addToHeader(UiComponent... headerComponents) {
        Arrays.stream(headerComponents).forEach(this::addToHeader);
    }

    /**
     * adds a UiComponent to the header of the panel. When at least one element is added the headerText is ignored
     *
     * @param component UiComponent to add
     */
    public void addToHeader(UiComponent component) {
        component.getElement().setAttribute("slot", "header");
        add(component);
    }

    /**
     * Possible values for accessible-role attribute of ui5-panel
     */
    @AllArgsConstructor
    public enum AccessibleRole {
        FORM("Form"),
        REGION("Region"),
        COMPLEMENTARY("Complementary");

        @Getter
        private final String text;
    }
}
