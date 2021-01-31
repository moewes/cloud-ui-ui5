package net.moewes.cloudui.ui5.list;

import lombok.AllArgsConstructor;
import lombok.Getter;
import net.moewes.cloudui.UiComponent;

/**
 * Java wrapper for UI5 web component ui5-li
 */
public class Ui5ListItem extends UiComponent {

    /**
     * default constructor
     */
    public Ui5ListItem() {
        super("ui5-li");
    }

    /**
     * sets the main text of the list item
     *
     * @param text main text
     */
    public void setText(String text) {
        setInnerHtml(text);
    }

    /**
     * sets an additional discrption
     *
     * @param description
     */
    public void setDescription(String description) {
        getElement().setAttribute("description", description);
    }

    /**
     * sets an icon and its placement
     *
     * @param iconName icon name - see icon explorer
     * @param atEnd    if true the icon is placed at the end of the item
     */
    public void setIcon(String iconName, boolean atEnd) {
        getElement().setAttribute("icon", iconName);
        if (atEnd) {
            getElement().setAttribute("icon-end", "true");
        }
    }

    /**
     * sets the type attribute of ui5-li
     *
     * @param type valid type
     */
    public void setType(Type type) {
        getElement().setAttribute("type", type.getAttributeText());
    }

    /**
     * sets the info attribute of ui5-li
     *
     * @param text text that is displayed in info area of list item
     */
    public void setInfo(String text) {
        getElement().setAttribute("info", text);
    }

    /**
     * sets the image attribute of ui5-li
     *
     * @param url the url to the image
     */
    public void setImage(String url) {
        getElement().setAttribute("image", url);
    }

    /**
     * sets the info-state attribute of ui5-li
     *
     * @param infoState
     */
    public void setInfoState(InfoState infoState) {
        getElement().setAttribute("info-state", infoState.getAttributeText());
    }

    /**
     * possible values for type attribute of ui5-li
     */
    @AllArgsConstructor
    @Getter
    public enum Type {
        ACTIVE("Active"),
        INACTIVE("Inactive"),
        DETAIL("Detail");

        private final String attributeText;
    }

    /**
     * possible values for info-state attribute of ui5-li
     */
    @AllArgsConstructor
    @Getter
    public enum InfoState {
        NONE("None"),
        SUCCESS("Success"),
        WARNING("Warning"),
        INFORMATION("Information"),
        ERROR("Error");

        private final String attributeText;
    }
}
