package net.moewes.cloudui.ui5;

import net.moewes.cloudui.UiElement;

/**
 * Java wrapper for UI5 web component ui5-textarea
 */
public class Ui5TextArea extends Ui5InputFieldBase {

    private boolean showExceededText;
    private boolean growing;

    /**
     * default constructor
     */
    public Ui5TextArea() {
        super("ui5-textarea");
        getElement().setHasInput(true);
    }

    /**
     * Determines whether the characters exceeding the maximum allowed character count are visible in the ui5-textarea.
     * <p>
     * If set to false, the user is not allowed to enter more characters than what is set in the maxlength property.
     * If set to true the characters exceeding the maxlength value are selected on paste and the counter below the ui5-textarea displays their number.
     *
     * @param showExceededText flag
     */
    public void showExceededText(boolean showExceededText) {

        this.showExceededText = showExceededText;
    }


    /**
     * Enables the ui5-textarea to automatically grow and shrink dynamically with its content.
     *
     * @param growing flag
     */
    public void setGrowing(boolean growing) {

        this.growing = growing;
    }

    /**
     * sets the number of rows up to it can grow in total
     *
     * @param maxLines numbers of rows in total
     */
    public void setGrowingMaxLines(int maxLines) {
        getElement().setAttribute("growing-max-lines", "" + maxLines);
    }

    /**
     * Defines the maximum number of characters that the value can have.
     *
     * @param maxLength number of charcters
     */
    public void setMaxLength(int maxLength) {
        getElement().setAttribute("maxlength", "" + maxLength);
    }


    /**
     * Defines the number of visible text lines for the component.
     *
     * @param numberRows number of rows
     */
    public void setRows(int numberRows) {
        getElement().setAttribute("rows", "" + numberRows);
    }

    @Override
    public UiElement render() {
        if (showExceededText) {
            getElement().setAttribute("show-exceeded-text", "true");
        }
        if (growing) {
            getElement().setAttribute("growing", "true");
        }
        return super.render();
    }
}
