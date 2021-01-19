package net.moewes.cloudui.ui5;

import lombok.AllArgsConstructor;
import lombok.Getter;
import net.moewes.cloudui.UiComponent;

/**
 * Java wrapper for ui5 web component avatar
 */
public class Ui5Avatar extends UiComponent {

    /**
     * default constructor
     */
    public Ui5Avatar() {
        super("ui5-avatar");
    }

    /**
     * sets a image to display
     *
     * @param imageUrl image url
     */
    public void setImage(String imageUrl) {
        getElement().setAttribute("image", imageUrl);
    }

    /**
     * sets the shape attribute of ui5-avatar
     *
     * @param shape shape
     */
    public void setShape(Shape shape) {
        getElement().setAttribute("shape", shape.getAttribute());
    }

    /**
     * sets the size attribute of ui5-avatar
     *
     * @param size size
     */
    public void setSize(Size size) {
        getElement().setAttribute("size", size.name());
    }

    /**
     * sets the icon. an icon is not displayd if an image url is set
     *
     * @param iconName icon name - see ui5 icon explorer
     */
    public void setIcon(String iconName) {
        getElement().setAttribute("icon", iconName);
    }

    /**
     * sets the initials attribute of ui5-avatar
     *
     * @param initials up to two latin letters are displayed as initials
     */
    public void setInitials(String initials) {
        getElement().setAttribute("initials", initials);
    }

    /**
     * sets the accessible-name attribute of ui5-avatar
     *
     * @param name name for aria
     */
    public void setAccessibleName(String name) {
        getElement().setAttribute("accessible-name", name);
    }

    /**
     * sets the interactive attribute of ui5-avatar
     *
     * @param interactive flag
     */
    public void setInteractive(boolean interactive) {
        if (interactive) {
            getElement().setAttribute("interactive", "true");
        }
    }

    /**
     * sets the background color of avatar
     *
     * @param color color
     */
    public void setBackgroundColor(BackgroundColor color) {
        getElement().setAttribute("background-color", color.getText());
    }

    /**
     * sets image-fit-type attribute of ui5-avatar
     *
     * @param type imageFitType
     */
    public void setImageFitType(ImageFitType type) {
        getElement().setAttribute("image-fit-type", type.getText());
    }


    /**
     * possible values for shape attribute of ui5-avatar
     */
    @AllArgsConstructor
    @Getter
    public enum Shape {
        CIRCLE("Circle"),
        SQUARE("Square");

        private final String attribute;
    }

    /**
     * possible values for size attribute of ui5-avatar
     */
    public enum Size {
        XS,
        S,
        M,
        L,
        XL
    }

    /**
     * possible values for background-color attribute of ui5-avatar
     */
    @AllArgsConstructor
    @Getter
    public enum BackgroundColor {
        ACCENT1("Accent1"),
        ACCENT2("Accent2"),
        ACCENT3("Accent3"),
        ACCENT4("Accent4"),
        ACCENT5("Accent5"),
        ACCENT6("Accent6"),
        ACCENT7("Accent7"),
        ACCENT8("Accent8"),
        ACCENT9("Accent9"),
        ACCENT10("Accent10"),
        PLACEHOLDER("Placeholder");
        private final String text;
    }

    /**
     * possible values for image-fit-type attribute of ui5-avatar
     */
    @AllArgsConstructor
    @Getter
    public enum ImageFitType {
        COVER("Cover"),
        CONTAIN("Contain");
        private final String text;
    }
}
