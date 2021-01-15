package net.moewes.cloud.ui.ui5;

import net.moewes.cloud.ui.UiElement;

/**
 * Java wrapper for UI5 web component ui5-checkbox
 */
public class Ui5CheckBox extends Ui5InputBase {

    private boolean wrap;

    /**
     * default constructor
     */
    public Ui5CheckBox() {
        super("ui5-checkbox");
    }

    /**
     * sets the text attribute of ui5-checkbox
     *
     * @param text text to show next to the box
     */
    public void setText(String text) {
        getElement().setAttribute("text", text);
    }

    public void setWrap(boolean wrap) {
        this.wrap = wrap;
    }

    @Override
    public UiElement render() {
        if (wrap) {
            getElement().setAttribute("wrap", "true");
        }
        return super.render();
    }

    // TODO need a decent js wrapper to value?
}
