package net.moewes.cloudui.ui5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import net.moewes.cloud.ui.UiElement;

public class Ui5DateInputFieldBase extends Ui5InputFieldBase {

    protected DateTimeFormatter formatter;
    protected String pattern;

    public Ui5DateInputFieldBase(String tag) {
        super(tag);
    }

    /**
     * sets a time pattern string for display and conversion of LocalTime values
     *
     * @param pattern pattern string
     */
    public void setFormatPattern(String pattern) {

        this.formatter = DateTimeFormatter.ofPattern(pattern);
        this.pattern = pattern;
    }

    /**
     * @return the current formatter
     */
    public DateTimeFormatter getFormatter() {
        return formatter;
    }

    @Override
    public UiElement render() {

        if (pattern != null) {
            getElement().setAttribute("format-pattern", pattern);
        }
        return super.render();
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
}
