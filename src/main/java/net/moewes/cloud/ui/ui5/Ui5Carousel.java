package net.moewes.cloud.ui.ui5;

import lombok.AllArgsConstructor;
import lombok.Getter;
import net.moewes.cloud.ui.UiComponent;
import net.moewes.cloud.ui.UiElement;

/**
 * Java wrapper for UI5 web component ui5-carousel
 */
public class Ui5Carousel extends UiComponent {

    private boolean cyclic;

    /**
     * default constructor
     */
    public Ui5Carousel() {
        super("ui5-carousel");
    }

    /**
     * sets arrows-placement attribute of ui5-carousel
     *
     * @param placement va
     */
    public void setArrowsPlacement(ArrowsPlacement placement) {
        getElement().setAttribute("arrows-placement", placement.getAttributeText());
    }

    /**
     * sets cyclic attribute of ui5-carousel
     *
     * @param cyclic if true you can navigate from end to start
     */
    public void setCyclic(boolean cyclic) {
        this.cyclic = cyclic;
    }

    /**
     * sets the page with is shown when the page is loaded
     *
     * @param index index of child-component starting with 0
     */
    public void setSelectedIndex(int index) {
        getElement().setAttribute("selected-index", "" + index);
    }

    /**
     * Sets the number of items per page on small size (up to 640px). One item per page shown by default.
     *
     * @param itemPerPage number of items
     */
    public void setItemPerPageS(int itemPerPage) {
        getElement().setAttribute("items-per-page-s", "" + itemPerPage);
    }

    /**
     * Sets the number of items per page on medium size (from 640px to 1024px). One item per page shown by default.
     *
     * @param itemPerPage number of items
     */
    public void setItemPerPageM(int itemPerPage) {
        getElement().setAttribute("items-per-page-m", "" + itemPerPage);
    }

    /**
     * Sets the number of items per page on large size (more than 1024px). One item per page shown by default.
     *
     * @param itemPerPage number of items
     */
    public void setItemPerPageL(int itemPerPage) {
        getElement().setAttribute("items-per-page-l", "" + itemPerPage);
    }

    /**
     * Overide for late binding of the boolean attributes
     */
    @Override
    public UiElement render() {

        if (cyclic) {
            getElement().setAttribute("cyclic", "true");
        }
        return super.render();
    }

    /**
     * possible values for arrowPlacement attribute
     */
    @AllArgsConstructor
    @Getter
    public enum ArrowsPlacement {
        CONTENT("Content"),
        NAVIGATION("Navigation");

        private final String attributeText;
    }
}
