package net.moewes.cloudui.ui5;

import net.moewes.cloudui.UiComponent;
import net.moewes.cloudui.UiElement;

/**
 * Java wrapper for UI5 web component ui5-wizard-step
 */
public class Ui5WizardStep extends UiComponent {

    private boolean branching;
    private boolean disabled;

    /**
     * default constructor
     */
    public Ui5WizardStep() {
        super("ui5-wizard-step");
    }
    
    /**
     * sets the heading attribute of ui5-wizard-step
     *
     * @param heading text to display as heading
     */
    public void setHeading(String heading) {
        getElement().setAttribute("heading", heading);
    }

    /**
     * sets the subheading attribute of ui5-wizard-step
     *
     * @param subheading text to displa as subheading
     */
    public void setSubheading(String subheading) {
        getElement().setAttribute("subheading", subheading);
    }

    /**
     * sets the icon attribute of ui5-wizard-step
     *
     * @param iconName the name of the icon to display - see icon explorer
     */
    public void setIconName(String iconName) {
        getElement().setAttribute("icon", iconName);
    }

    /**
     * sets the branching attribute of ui5-wizard-step
     *
     * @param branching flag
     */
    public void setBranching(boolean branching) {

        this.branching = branching;
    }

    /**
     * sets the disabled attribute of ui5-wizard-step
     *
     * @param disabled flag
     */
    public void setDisabled(boolean disabled) {

        this.disabled = disabled;
    }

    /**
     * overiddden for late binding of boolean values
     *
     * @return ui element
     */
    @Override
    public UiElement render() {
        if (branching) {
            getElement().setAttribute("branching", "true");
        }
        if (disabled) {
            getElement().setAttribute("disabled", "true");
        }
        return super.render();
    }
}
