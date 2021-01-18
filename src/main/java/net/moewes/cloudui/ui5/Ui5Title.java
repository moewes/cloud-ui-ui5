package net.moewes.cloudui.ui5;

import net.moewes.cloud.ui.UiComponent;

/**
 * Java wrapper for UI5 web component ui-title
 */
public class Ui5Title extends UiComponent {

    /**
     * default constructor
     */
    public Ui5Title() {
        super("ui5-title");
    }

    /**
     * constructor
     *
     * @param text text ui5-title displays
     */
    public Ui5Title(String text) {
        this();
        setText(text);
    }

    /**
     * constructor
     *
     * @param text  text ui5-title displays
     * @param level the ui5-title level
     */
    public Ui5Title(String text, Level level) {
        this();
        setText(text);
        setLevel(level);
    }

    /**
     * sets the text which is displayed
     *
     * @param text text ui5-title displays
     */
    public void setText(String text) {
        getElement().setInnerHtml(text);
    }

    /**
     * sets the level attribute of ui5-title
     *
     * @param level the ui5-title level
     */
    public void setLevel(Level level) {
        getElement().setAttribute("level", level.name());
    }

    /**
     * sets the wrap attribute of ui5-title
     *
     * @param wrap defines whether the ui5-title would wrap.
     */
    public void setWrap(boolean wrap) {
        if (wrap) {
            getElement().setAttribute("wrap", "true");
        }
    }

    /**
     * Defines the ui5-title level.
     */
    public enum Level {
        H1,
        H2,
        H3,
        H4,
        H5,
        H6
    }

}
