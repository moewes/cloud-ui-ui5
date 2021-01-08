package net.moewes.cloud.ui.ui5;

import lombok.AllArgsConstructor;
import lombok.Getter;
import net.moewes.cloud.ui.UiComponent;

// TODO JavaDoc
public class Ui5Link extends UiComponent {

    public Ui5Link() {
        super("ui5-link");
    }

    public Ui5Link(String text, String url) {
        this();
        setText(text);
        setHref(url);
    }

    public void setText(String text) {
        getElement().setInnerHtml(text);
    }

    public void setHref(String url) {
        getElement().setAttribute("href", url);
    }

    // TODO target

    public void setDisabled(boolean disabled) {
        if (disabled) {
            getElement().setAttribute("disabled", "true");
        }
    }

    public void setDesign(Design design) {
        getElement().setAttribute("design", design.getText());
    }

    // TODO wrap

    @AllArgsConstructor
    public enum Design {
        DEFAULT("Default"),
        SUBTLE("Subtle"),
        EMPHASIZED("Emphasized");

        @Getter
        private final String text;
    }

}
