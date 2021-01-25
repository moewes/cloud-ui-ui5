package net.moewes.cloudui.ui5;

import java.util.Arrays;
import java.util.function.Consumer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import net.moewes.cloudui.UiComponent;
import net.moewes.cloudui.UiEvent;
import net.moewes.cloudui.UiEventAttributeMapping;
import net.moewes.cloudui.UiEventDefinition;

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

    @Override
    public void addEventListener(String event, Consumer<UiEvent> function) {
        registerEvenrHandler(function,
                UiEventDefinition.builder().eventName(event)
                        .attributeMappings(Arrays.asList(
                                UiEventAttributeMapping.builder().fieldName("targetRef").isHtmlElement(true).build()))
                        .build());
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
