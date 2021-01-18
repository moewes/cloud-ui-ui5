package net.moewes.cloudui.ui5;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Java wrapper for UI5 web component ui5-input
 * <p>
 * suggestions and form support are not supported
 */
public class Ui5Input extends Ui5InputFieldBase {

    /**
     * default constructor
     */
    public Ui5Input() {
        super("ui5-input");
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
     * adds an icon to the input field
     *
     * @param icon icon to add
     */
    public void addIcon(Ui5Icon icon) {
        icon.getElement().setAttribute("slot", "icon");
        add(icon);
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
