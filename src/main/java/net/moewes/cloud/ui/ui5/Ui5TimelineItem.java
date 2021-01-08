package net.moewes.cloud.ui.ui5;

import net.moewes.cloud.ui.UiComponent;

/**
 * Java wrapper for UI5 web component ui5-timeline-item
 * used as children elements in Ui5Timeline
 */
public class Ui5TimelineItem extends UiComponent {

    public Ui5TimelineItem() {
        super("ui5-timeline-item");
    }

    /**
     * sets title-text attribute of ui5-timeline-item
     *
     * @param text the text to display as title
     */
    public void setTitle(String text) {
        getElement().setAttribute("title-text", text);
    }

    /**
     * sets subtitle-text attribute of ui5-timeline-item
     *
     * @param text the text to display as subtitle
     */
    public void setSubtitle(String text) {
        getElement().setAttribute("subtitle-text", text);
    }

    /**
     * sets icon attribute of ui5-timeline-item
     *
     * @param icon icon name - see ui5 icon explorer
     */
    public void setIcon(String icon) {
        getElement().setAttribute("icon", icon);
    }

    /**
     * sets the item-name attribute of ui5-timeline-item
     * <p>
     * register event handler for event item-name-click
     *
     * @param name      text that is diplayed as first element in item header
     * @param clickable defines if it is displayed as link
     */
    public void setName(String name, boolean clickable) {
        getElement().setAttribute("item-name", name);
        if (clickable) {
            getElement().setAttribute("item-name-clickable", "true");
        }
    }
}
