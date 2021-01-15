package net.moewes.cloud.ui.ui5;

import java.util.Arrays;

import net.moewes.cloud.ui.UiComponent;
import net.moewes.cloud.ui.UiElement;

/**
 * Java wrapper for UI5 web component ui5-card
 */
public class Ui5Card extends UiComponent {

    private boolean interactiveHeader;

    /**
     * default constructor
     */
    public Ui5Card() {
        super("ui5-card");
    }

    /**
     * sets the header text of the card
     *
     * @param text text to display as header
     */
    public void setHeading(String text) {
        getElement().setAttribute("heading", text);
    }

    /**
     * sets the second text line in the header of the card
     *
     * @param text text to display as subheader
     */
    public void setSubHeading(String text) {
        getElement().setAttribute("subheading", text);
    }

    /**
     * sets a status text in up right corner of the header of the card. When component are added to the action slot this is ignored
     *
     * @param text text to display
     */
    public void setStatustext(String text) {
        getElement().setAttribute("status", text);
    }

    /**
     * add an icon to the header
     *
     * @param iconName name of the icon
     */
    public void addIcon(String iconName) {
        Ui5Icon icon = new Ui5Icon(iconName);
        icon.getElement().setAttribute("slot", "avatar");
        add(icon);
    }

    /**
     * Defines if the ui5-card header would be interactive, e.g gets hover effect, gets focused and headerPress event is fired, when it is pressed.
     *
     * @param interactiveHeader when true header ist interactive
     */
    public void interactiveHeader(boolean interactiveHeader) {

        this.interactiveHeader = interactiveHeader;
    }

    /**
     * add components to the up right corner of the header
     *
     * @param components one or more ui components
     */
    public void addActionElement(UiComponent... components) {
        Arrays.stream(components).forEach(item -> {
            item.getElement().setAttribute("slot", "action");
            add(item);
        });
    }

    /**
     * overridden to support late binding of boolean attributes
     */
    @Override
    public UiElement render() {
        if (interactiveHeader) {
            getElement().setAttribute("header-interactive", "true");
        }
        return super.render();
    }
}
