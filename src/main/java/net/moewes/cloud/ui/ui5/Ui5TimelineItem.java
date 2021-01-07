package net.moewes.cloud.ui.ui5;

import net.moewes.cloud.ui.UiComponent;

/**
 * Java-Wrapper for web component ui5-timeline-item
 */
public class Ui5TimelineItem extends UiComponent {

    public Ui5TimelineItem() {
        super("ui5-timeline-item");
    }

    // TODO convience constructors

    public void setTitle(String text) {
        getElement().setAttribute("title-text", text);
    }

    public void setSubtitle(String text) {
        getElement().setAttribute("subtitle-text", text);
    }

    public void setIcon(String icon) { // TODO Icon enum
        getElement().setAttribute("icon", icon);
    }

    public void setName(String name, boolean clickable) {
        getElement().setAttribute("item-name", name);
        if (clickable) {
            getElement().setAttribute("item-name-clickable", "true");
        }
        ;
    }
}
