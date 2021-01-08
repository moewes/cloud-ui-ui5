package net.moewes.cloud.ui.ui5;

import java.util.Arrays;

import lombok.AllArgsConstructor;
import lombok.Getter;
import net.moewes.cloud.ui.UiComponent;

/**
 * Java wrapper for UI5 web component ui5-panel
 */
public class Ui5Panel extends UiComponent {

    public Ui5Panel() {
        super("ui5-panel");
    }

    public Ui5Panel(String headerText, boolean fixed) {
        this();
        setHeaderText(headerText);
        setFixed(fixed);
    }

    public void setHeaderText(String text) {
        getElement().setAttribute("header-text", text);
    }

    public void setHeaderLevel(Ui5Title.Level level) {
        getElement().setAttribute("header-level", level.name());
    }

    public void setFixed(boolean fixed) {
        if (fixed) {
            getElement().setAttribute("fixed", "true");
        }
    }

    public void setCollapsed(boolean collapsed) {
        if (collapsed) {
            getElement().setAttribute("collapsed", "true");
        }
    }

    public void setAccessibleRole(AccessibleRole role) {
        getElement().setAttribute("accessible-role", role.getText());
    }

    public void addToHeader(UiComponent... headerComponents) {
        Arrays.stream(headerComponents).forEach(this::addToHeader);
    }

    public void addToHeader(UiComponent component) {
        component.getElement().setAttribute("slot", "header");
        add(component);
    }

    @AllArgsConstructor
    public enum AccessibleRole {
        FORM("Form"),
        REGION("Region"),
        COMPLEMENTARY("Complementary");

        @Getter
        private final String text;
    }
}
