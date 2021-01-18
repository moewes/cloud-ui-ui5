package net.moewes.cloudui.ui5;

import lombok.AllArgsConstructor;
import lombok.Getter;
import net.moewes.cloud.ui.UiComponent;

/**
 * Java wrapper for UI5 web component ui5-badge
 */
public class Ui5Badge extends UiComponent {

    /**
     * default constructor
     */
    public Ui5Badge() {
        super("ui5-badge");
    }

    /**
     * constructor
     *
     * @param text text to display
     */
    public Ui5Badge(String text) {
        this();
        setInnerHtml(text);
    }

    /**
     * constructor
     *
     * @param text text to display
     * @param icon icon component
     */
    public Ui5Badge(String text, Ui5Icon icon) {
        this();
        setInnerHtml(text);
        addIcon(icon);
    }

    /**
     * constructor
     *
     * @param icon icon component
     */
    public Ui5Badge(Ui5Icon icon) {
        this();
        addIcon(icon);
    }

    /**
     * adds a icon to the badge
     *
     * @param icon icon component
     */
    public void addIcon(Ui5Icon icon) {
        icon.getElement().setAttribute("slot", "icon");
        add(icon);
    }

    /**
     * stes color-scheme attribute of ui5-badge
     *
     * @param schema value
     */
    public void setColorScheme(ColorScheme schema) {
        getElement().setAttribute("color-scheme", schema.getAttributeText());
    }

    /**
     * possible values for attribute color-scheme
     */
    @AllArgsConstructor
    @Getter
    public enum ColorScheme {
        ONE("1"),
        TWO("2"),
        THREE("3"),
        FOUR("4"),
        FIVE("5"),
        SIX("6"),
        SEVEN("7"),
        EIGHT("8"),
        NINE("9"),
        TEN("10");

        private final String attributeText;

    }
}
