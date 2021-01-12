package net.moewes.cloud.ui.ui5;

import java.util.function.Consumer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import net.moewes.cloud.ui.UiComponent;

/**
 * Java wrapper for UI5 web component ui5-button
 * <p>
 * the attributes icon-size and submits are not supported
 */
public class Ui5Button extends UiComponent {

    /**
     * default constructor
     */
    public Ui5Button() {
        super("ui5-button");
    }

    /**
     * constructor
     *
     * @param text text of the button
     */
    public Ui5Button(String text) {
        this();
        setText(text);
    }

    /**
     * sets the text of the button
     *
     * @param text text of the button
     */
    public void setText(String text) {
        setInnerHtml(text);
    }

    /**
     * sets the design of a button
     *
     * @param design design
     */
    public void setDesign(Design design) {
        getElement().setAttribute("design", design.getText());
    }

    /**
     * disable the button
     *
     * @param disabled true if button is disabled
     */
    public void setDisabled(boolean disabled) {
        if (disabled) {
            getElement().setAttribute("disabled", "true");
        }
    }

    /**
     * sets an icon for the button
     *
     * @param iconName icon name - see icon explorer
     */
    public void setIcon(String iconName) {
        getElement().setAttribute("icon", iconName);
    }

    /**
     * sets the icon-end attribute of ui-button
     *
     * @param iconEnd if true the icon is displayed behind to text
     */
    public void setIconEnd(boolean iconEnd) {
        if (iconEnd) {
            getElement().setAttribute("icon-end", "true");
        }
    }

    /**
     * adds a handler that reacts to a click event of ui5-button
     *
     * @param handler handler
     */
    public void addClickHandler(Consumer<String> handler) {
        super.addEventListener("click", handler);
    }

    /**
     * possible values of design attribute of ui5-button
     */
    @AllArgsConstructor
    @Getter
    public enum Design {
        DEFAULT("Default"),
        EMPHASIZED("Emphasized"),
        POSITIVE("Positive"),
        NEGATIVE("Negative"),
        TRANSPARENT("Transparent");

        private final String text;
    }
}


