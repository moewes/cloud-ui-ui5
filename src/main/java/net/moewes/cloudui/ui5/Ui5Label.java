package net.moewes.cloudui.ui5;

import net.moewes.cloudui.UiComponent;
import net.moewes.cloudui.UiElement;

/**
 * Java wrapper for UI5 web component ui5-label
 */
public class Ui5Label extends UiComponent {

    private boolean showColon;
    private boolean required;
    private boolean shouldWrap;
    private UiComponent labelForElement;

    /**
     * default constructor
     */
    public Ui5Label() {
        super("ui5-label");
    }

    /**
     * constructor
     *
     * @param text text to display
     */
    public Ui5Label(String text) {
        super("ui5-label");
        setText(text);
    }

    /**
     * sets the text to display
     *
     * @param text text to display
     */
    public void setText(String text) {
        setInnerHtml(text);
    }

    /**
     * sets the for attribute of ui5-label
     *
     * @param element component for that this label is for
     */
    public void setFor(UiComponent element) {
        this.labelForElement = element;
    }

    /**
     * sets the for attribute of ui5-label
     * <p>
     * hint: consider that the id is dynamically generated for UiComponents. Call this method as late as possible
     *
     * @param id id of the input this label is for
     */
    public void setFor(String id) {
        getElement().setAttribute("for", id);
    }

    /**
     * sets the required attribute of ui5-label
     *
     * @param required flag
     */
    public void setRequired(boolean required) {
        this.required = required;
    }

    /**
     * @return true if label is for a required field
     */
    public boolean isRequired() {
        return required;
    }

    /**
     * sets showColon attribute of ui5-label
     *
     * @param showColon if true a colon is added
     */
    public void setShowColon(boolean showColon) {
        this.showColon = showColon;
    }

    /**
     * @return true if colon at the end of the label ist added
     */
    public boolean isColonShown() {
        return showColon;
    }

    /**
     * sets the wrap attribute of ui5-label
     *
     * @param wrap if true label could be multiline
     */
    public void setWrap(boolean wrap) {
        this.shouldWrap = wrap;
    }

    /**
     * @return true if wrap ist enabled
     */
    public boolean isWrapEnabled() {
        return shouldWrap;
    }

    @Override
    public UiElement render() {
        if (showColon) {
            getElement().setAttribute("show-colon", null);
        }
        if (required) {
            getElement().setAttribute("required", null);
        }
        if (shouldWrap) {
            getElement().setAttribute("wrap", null);
        }
        UiElement result = super.render();

        if (labelForElement != null) {
            getElement().setAttribute("for", labelForElement.getId());
        }
        return result;
    }
}
