package net.moewes.cloudui.ui5;

import java.util.Arrays;

import lombok.AllArgsConstructor;
import lombok.Getter;
import net.moewes.cloud.ui.UiComponent;

/**
 * Java wrapper for UI5 web component ui5-bar
 */
public class Ui5Bar extends UiComponent {

    /**
     * default constructor
     */
    public Ui5Bar() {
        super("ui5-bar");
    }

    /**
     * sets design attribute of ui5-bar
     *
     * @param design valid design
     */
    public void setDesign(Design design) {
        getElement().setAttribute("design", design.getAttributeText());
    }

    /**
     * adds components at start of bar
     *
     * @param components one or more ui components
     */
    public void addStartContent(UiComponent... components) {
        Arrays.stream(components).forEach(component -> {
            component.getElement().setAttribute("slot", "startContent");
            add(component);
        });
    }

    /**
     * adds components in the center of bar
     *
     * @param components one or more ui components
     */
    public void addMiddleContent(UiComponent... components) {
        Arrays.stream(components).forEach(component -> {
            component.getElement().setAttribute("slot", "middleContent");
            add(component);
        });
    }

    /**
     * adds components at end of bar
     *
     * @param components one or more ui components
     */
    public void addEndContent(UiComponent... components) {
        Arrays.stream(components).forEach(component -> {
            component.getElement().setAttribute("slot", "endContent");
            add(component);
        });
    }

    /**
     * possible values for design attribute
     */
    @AllArgsConstructor
    @Getter
    public enum Design {
        HEADER("Header"),
        SUBHEADER("Subheader"),
        FOOTER("Footer"),
        FLOATING_FOOTER("FloatingFooter");

        private final String attributeText;
    }

}
