package net.moewes.cloud.ui.ui5;

import net.moewes.cloud.ui.UiComponent;

public class Ui5Label extends UiComponent {

    public Ui5Label() {
        super("ui5-label");
    }

    public Ui5Label(String text) {
        super("ui5-label");
        setText(text);
    }

    public void setText(String text) {
        setInnerHtml(text);
    }

    public void setFor(UiComponent element) {
        setFor(element.getId());
    }

    public void setFor(String id) {
        getElement().setAttribute("for", id);
    } // TODO das könnte ein Problem sein mit den dynamischen ids!

    public void setRequired(boolean required) {
        if (required) {
            getElement().setAttribute("required", null);
        }
    }

    public void setShowColon(boolean showColon) {
        if (showColon) {
            getElement().setAttribute("show-colon", null);
        }
    }

    // TODO wrap

}
