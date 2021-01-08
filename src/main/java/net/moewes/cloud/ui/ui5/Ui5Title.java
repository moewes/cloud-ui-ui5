package net.moewes.cloud.ui.ui5;

import net.moewes.cloud.ui.UiComponent;

/**
 * Java wrapper for UI5 web component ui-title
 */
public class Ui5Title extends UiComponent {

    public Ui5Title() {
        super("ui5-title");
    }

    public Ui5Title(String text) {
        this();
        setText(text);
    }

    public Ui5Title(String text, Level level) {
        this();
        setText(text);
        setLevel(level);
    }

    /**
     * @param text text ui5-title displays
     */
    public void setText(String text) {
        getElement().setInnerHtml(text);
    }

    /**
     * @param level sets the ui5-title level
     */
    public void setLevel(Level level) {
        getElement().setAttribute("level", level.name());
    }

    /**
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
