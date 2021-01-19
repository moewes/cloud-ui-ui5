package net.moewes.cloudui.ui5;

import net.moewes.cloudui.UiComponent;
import net.moewes.cloudui.UiElement;

/**
 * Java wrapper for UI5 web component ui5-icon
 */
public class Ui5Icon extends UiComponent {

    private boolean interactive;
    private boolean showTooltip;

    /**
     * default constructor
     *
     * @param iconName name of the icon - see icon explorer
     */
    public Ui5Icon(String iconName) {
        super("ui5-icon");
        getElement().setAttribute("name", iconName);
    }

    /**
     * sets accessible-name attribute of ui5-icon
     *
     * @param text alternative text for screen reader etc.
     */
    public void setAccessibleName(String text) {
        getElement().setAttribute("accessible-name", text);
    }

    /**
     * sets interactive attribute of ui5-icon
     *
     * @param interactive flag
     */
    public void setInteractive(boolean interactive) {
        this.interactive = interactive;
    }

    /**
     * @return true if icon is selectable
     */
    public boolean isInteractive() {
        return interactive;
    }

    /**
     * sets show-tooltip attribute of ui5-icon
     *
     * @param showTooltip flag
     */
    public void setShowTooltip(boolean showTooltip) {
        this.showTooltip = showTooltip;
    }

    /**
     * @return true if tooltip should be shown
     */
    public boolean hasTooltip() {
        return showTooltip;
    }

    @Override
    public UiElement render() {
        if (interactive) {
            getElement().setAttribute("interactive", "true");
        }
        if (showTooltip) {
            getElement().setAttribute("show-tooltip", "true");
        }
        return super.render();
    }
}
