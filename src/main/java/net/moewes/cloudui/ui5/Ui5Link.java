package net.moewes.cloudui.ui5;

import lombok.AllArgsConstructor;
import lombok.Getter;
import net.moewes.cloud.ui.UiComponent;

/**
 * Java wrapper for UI5 web component ui5-link
 */
public class Ui5Link extends UiComponent {

    /**
     * default constructor
     */
    public Ui5Link() {
        super("ui5-link");
    }

    /**
     * constructor
     *
     * @param text the text to display
     * @param url  url to open when the link is clicked
     */
    public Ui5Link(String text, String url) {
        this();
        setText(text);
        setHref(url);
    }

    /**
     * sets the link text
     *
     * @param text the text to display
     */
    public void setText(String text) {
        getElement().setInnerHtml(text);
    }

    /**
     * sets the href attribute of ui5-link
     *
     * @param url url to open when the link is clicked
     */
    public void setHref(String url) {
        getElement().setAttribute("href", url);
    }

    /**
     * sets the target attribute of ui5-link
     *
     * @param taget taget of link - see HTML docs for meaning
     */
    public void setTarget(Target taget) {
        getElement().setAttribute("target", taget.getText());
    }

    public void setDisabled(boolean disabled) {
        if (disabled) {
            getElement().setAttribute("disabled", "true");
        }
    }

    /**
     * sets the design attribute of ui5-link
     *
     * @param design design
     */
    public void setDesign(Design design) {
        getElement().setAttribute("design", design.getText());
    }

    /**
     * sets the wrap attribute of ui5-link
     *
     * @param wrap true when the link text should wrap if there is not enough space
     */
    public void setWrap(boolean wrap) {
        if (wrap) {
            getElement().setAttribute("wrap", "true");
        }
    }

    /**
     * possible values for the design attribute of ui5-link
     */
    @AllArgsConstructor
    public enum Design {
        DEFAULT("Default"),
        SUBTLE("Subtle"),
        EMPHASIZED("Emphasized");

        @Getter
        private final String text;
    }

    /**
     * possible values for target attribute of ui5-link
     */
    @AllArgsConstructor
    public enum Target {
        SELF("_self"),
        TOP("_top"),
        BLANK("_black"),
        PARENT("_parent"),
        SEARCH("_search");

        @Getter
        private final String text;
    }

}
