package net.moewes.cloud.ui.ui5;

import net.moewes.cloud.ui.UiElement;
import net.moewes.cloud.ui.html.Div;

public abstract class Ui5InputFieldBase extends Ui5InputBase {
    protected boolean required;

    public Ui5InputFieldBase(String tag) {
        super(tag);
        getElement().setHasInput(true);
    }

    /**
     * sets required attribute of ui5 input field
     *
     * @param required flag
     */
    public void setRequired(boolean required) {
        this.required = required;
        if (required) {
            getElement().setAttribute("disabled", null);
        }
    }

    /**
     * sets the placeholder attribute of ui5 input field
     *
     * @param placeholder placeholder string
     */
    public void setPlaceholder(String placeholder) {
        getElement().setAttribute("placeholder", placeholder);
    }

    /**
     * add a value sate message to the input field
     *
     * @param message text to show
     */
    public void addValueStateMessage(String message) {
        Div content = new Div();
        content.getElement().setAttribute("slot", "valueStateMessage");
        content.setInnerHtml(message);
        add(content);
    }

    /**
     * sets value state and message
     *
     * @param message    text to show
     * @param valueState value state
     */
    public void addValueStateMessage(String message, ValueState valueState) {
        setValueState(valueState);
        addValueStateMessage(message);
    }

    @Override
    public UiElement render() {

        if (required) {
            getElement().setAttribute("disabled", null);
        }
        return super.render();
    }
}
