package net.moewes.cloud.ui.ui5;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import net.moewes.cloud.ui.UiComponent;

/**
 * Java wrapper for UI5 web component ui5-calendar
 */
public class Ui5Calendar extends UiComponent {

    /**
     * default constructor
     */
    public Ui5Calendar() {
        super("ui5-calendar");
        getElement().setHasInput(true); // TODO does not work yet, check with rc.12
    }

    /**
     * hides the week number in ui5-calendar
     */
    public void hideWeekNumbers() {
        getElement().setAttribute("hide-week-numbers", "true");
    }

    /**
     * sets  min-date attribute of ui5-calendar
     *
     * @param date the earliest valid date to select (and scroll)
     */
    public void setMinDate(LocalDate date) {
        getElement().setAttribute("min-date", date.toString());
    }

    /**
     * sets  max-date attribute of ui5-calendar
     *
     * @param date the latest valid date to select (and scroll)
     */
    public void setMaxDate(LocalDate date) {
        getElement().setAttribute("max-date", date.toString());
    }

    /**
     * sets the selection type of calendar
     * <p>
     * Hint: As of UI5 Web Components 1.0.0.rc11 there are issues with CloudUi eventing and selection modes other then single
     *
     * @param selection value
     */
    // TODO JavaDoc
    public void setSelection(CalendarSelection selection) {
        getElement().setAttribute("selection", selection.getAttributeText());
    }

    /**
     * possible values for attribute selection
     */
    @AllArgsConstructor
    @Getter
    public enum CalendarSelection {
        SINGLE("Single"),
        RANGE("Range"),
        MULTIPLE("Multiple");

        private final String attributeText;
    }
}
