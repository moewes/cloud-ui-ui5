package net.moewes.cloud.ui.ui5;

import lombok.AllArgsConstructor;
import lombok.Getter;
import net.moewes.cloud.ui.UiComponent;

/**
 * Java Wrapper for ui5 web component avatar
 */
public class Ui5Avatar extends UiComponent {

    public Ui5Avatar() {
        super("ui5-avatar");
    }

    public void setImage(String image) {
        getElement().setAttribute("image", image);
    }

    public void setShape(Shape shape) {
        getElement().setAttribute("shape", shape.getAttribute());
    }

    public void setSize(Size size) {
        getElement().setAttribute("size", size.name());
    }

    public void setIcon(String icon) { // TODO Icon.Enum
        getElement().setAttribute("icon", icon);
    }

    public void setInitials(String initials) {
        getElement().setAttribute("initials", initials);
    }

    // TODO accessible Name
    // TODO background Color
    // TODO image fit type
    // TODO interactive

    @AllArgsConstructor
    @Getter
    public enum Shape {
        CIRCLE("Circle"),
        SQUARE("Square");

        private String attribute;
    }

    public enum Size {
        XS,
        S,
        M,
        L,
        XL
    }

}
