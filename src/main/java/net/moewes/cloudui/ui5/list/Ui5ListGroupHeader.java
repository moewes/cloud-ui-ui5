package net.moewes.cloudui.ui5.list;

import net.moewes.cloudui.UiComponent;

/**
 * Java wrapper for UI5 web component ui5-li-groupheader
 */
public class Ui5ListGroupHeader extends UiComponent {

    /**
     * default constructor
     *
     * @param text header text
     */
    public Ui5ListGroupHeader(String text) {
        super("ui5-li-groupheader");
        setInnerHtml(text);
    }
}
