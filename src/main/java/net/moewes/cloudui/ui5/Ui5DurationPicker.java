package net.moewes.cloudui.ui5;

import net.moewes.cloudui.UiElement;

/**
 * Java wrapper fpr UI5 web component ui5-duration-picker
 */
public class Ui5DurationPicker extends Ui5InputFieldBase {

    private boolean hideSeconds;
    private boolean hideMinutes;
    private boolean hideHours;

    /**
     * default constructor
     */
    public Ui5DurationPicker() {
        super("ui5-duration-picker");
    }

    /**
     * Defines whether a slider for seconds will be available
     *
     * @param hideSeconds if true its hidden
     */
    public void hideSeconds(boolean hideSeconds) {

        this.hideSeconds = hideSeconds;
    }

    /**
     * Defines whether a slider for minutes will be available
     *
     * @param hideMinutes if true its hidden
     */
    public void hideMinutes(boolean hideMinutes) {

        this.hideMinutes = hideMinutes;
    }

    /**
     * Defines whether a slider for hours will be available
     *
     * @param hideHours if true its hidden
     */
    public void hideHours(boolean hideHours) {

        this.hideHours = hideHours;
    }

    public void setMaxValue(String maxValue) {
        getElement().setAttribute("max-value", maxValue);
    } // TODO data type?

    /**
     * Defines the selection step for the minutes
     *
     * @param step the step wide
     */
    public void setMinutesStep(int step) {
        getElement().setAttribute("minutes-step", "" + step);
    }

    /**
     * Defines the selection step for the seconds
     *
     * @param step the step wide
     */
    public void setSecondsStep(int step) {
        getElement().setAttribute("seconds-step", "" + step);
    }

    @Override
    public UiElement render() {
        if (hideHours) {
            getElement().setAttribute("hide-hours", "true");
        }
        if (hideMinutes) {
            getElement().setAttribute("hide-minutes", "true");
        }
        if (hideSeconds) {
            getElement().setAttribute("hide-seconds", "true");
        }
        return super.render();
    }
}
