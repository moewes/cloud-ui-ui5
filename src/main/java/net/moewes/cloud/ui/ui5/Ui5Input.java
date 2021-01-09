package net.moewes.cloud.ui.ui5;

import lombok.AllArgsConstructor;
import lombok.Getter;
import net.moewes.cloud.ui.UiComponent;
import net.moewes.cloud.ui.UiElement;
import net.moewes.cloud.ui.html.Div;

/**
 * Java wrapper for UI5 web component ui5-input
 * <p>
 * suggestions and form support are not supported
 */
public class Ui5Input extends UiComponent {

    private boolean readOnly;
    private boolean disabled;
    private boolean required;

    /**
     * default constructor
     */
    public Ui5Input() {
        super("ui5-input");
        getElement().setHasInput(true);
    }


    /**
     * sets readonly attribute of ui5-input
     *
     * @param readOnly flag
     */
    public void setReadOnly(boolean readOnly) {
        this.readOnly = readOnly;
    }


    /**
     * sets disabled attribute of ui5-input
     *
     * @param disabled flag
     */
    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
        if (disabled) {
            getElement().setAttribute("disabled", null);
        }
    }


    /**
     * sets required attribute of ui5-input
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
     * sets the placeholder attribute of ui5-input
     *
     * @param placeholder placeholder string
     */
    public void setPlaceholder(String placeholder) {
        getElement().setAttribute("placeholder", placeholder);
    }

    /**
     * set maxlength attribute of ui5-input
     *
     * @param maxLength positive number
     */
    public void setMaxLength(int maxLength) {
        getElement().setAttribute("maxlength", "" + maxLength);
    }

    /**
     * sets type attribute of ui5-input
     *
     * @param inputType input type
     */
    public void setType(InputType inputType) {
        getElement().setAttribute("type", inputType.getText());
    }

    /**
     * sets value-state attribute of ui5-input
     *
     * @param valueState valueState
     */
    public void setValueState(ValueState valueState) {
        getElement().setAttribute("value-state", valueState.getText());
    }

    /**
     * adds an icon to the input field
     *
     * @param icon icon to add
     */
    public void addIcon(Ui5Icon icon) {
        icon.getElement().setAttribute("slot", "icon");
        add(icon);
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

        if (readOnly) {
            getElement().setAttribute("readonly", null);
        }
        if (disabled) {
            getElement().setAttribute("disabled", null);
        }
        if (required) {
            getElement().setAttribute("disabled", null);
        }
        return super.render();
    }

    /**
     * possible values for attribute value-state of ui5-input
     */
    @AllArgsConstructor
    @Getter
    public enum ValueState {
        NONE("None"),
        ERROR("Error"),
        WARNING("Warning"),
        SUCCESS("Success"),
        INFORMATION("Information");

        private final String text;
    }

    /**
     * possible values for attribute type of ui5-input
     */
    @AllArgsConstructor
    @Getter
    public enum InputType {
        TEXT("Text"),
        EMAIL("Email"),
        NUMBER("Number"),
        PASSWORD("Password"),
        TEL("Tel"),
        URL("URL");
        private final String text;
    }
}
