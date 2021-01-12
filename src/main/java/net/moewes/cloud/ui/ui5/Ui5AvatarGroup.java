package net.moewes.cloud.ui.ui5;

import lombok.AllArgsConstructor;
import lombok.Getter;
import net.moewes.cloud.ui.UiComponent;

/**
 * Java wrapper for UI5 web component ui5-avatar-group
 */
public class Ui5AvatarGroup extends UiComponent {

    /**
     * default constructor
     */
    public Ui5AvatarGroup() {
        super("ui5-avatar-group");
    }

    /**
     * sets type of avatar group
     *
     * @param type avatart group type
     */
    public void setType(AvatarGroupType type) {
        getElement().setAttribute("type", type.getAttributeText());
    }

    /**
     * sets the avatar-size attribute of ui5-avatar-group
     *
     * @param avatarSize size
     */
    public void setAvatarSize(Ui5Avatar.Size avatarSize) {
        getElement().setAttribute("avatar-size", avatarSize.name());
    }

    /**
     * possible value for type attribute of web ui5-avatar-group
     */
    @AllArgsConstructor
    @Getter
    public enum AvatarGroupType {
        GROUP("Group"),
        INDIVIDUAL("Individual");
        private final String attributeText;
    }
}
