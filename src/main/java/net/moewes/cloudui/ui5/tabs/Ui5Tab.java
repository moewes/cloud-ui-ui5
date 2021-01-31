package net.moewes.cloudui.ui5.tabs;

import lombok.AllArgsConstructor;
import lombok.Getter;
import net.moewes.cloudui.UiComponent;

// TODO JavaDoc
public class Ui5Tab extends UiComponent {

    private boolean disabled;
    private boolean selected;

    public Ui5Tab() {
        super("ui5-tab");
    }

    public void setText(String text) {
        getElement().setAttribute("text", text);
    }

    public void setIcon(String iconName) {
        getElement().setAttribute("icon", iconName);
    }

    public void setAdditionalText(String text) {
        getElement().setAttribute("additional-text", text);
    }

    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }

    public void setSelected(boolean selected) { // FIXME ? level higher?
        this.selected = selected;
    }

    public void setSemanticColor(SemanticColor color) {
        getElement().setAttribute("semantic-color", color.getAttributeText());
    }

    @AllArgsConstructor
    @Getter
    public enum SemanticColor {
        DEFAULT("Default"),
        NEUTRAL("Neutral"),
        POSITIVE("Positive"),
        CRITICAL("Critical"),
        NEGATIVE("Negative");

        private final String attributeText;
    }

}
