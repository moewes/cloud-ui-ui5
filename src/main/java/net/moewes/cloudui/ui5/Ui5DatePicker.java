package net.moewes.cloudui.ui5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Java wrapper for UI% web component ui5-date-picker
 */
public class Ui5DatePicker extends Ui5DateInputFieldBase {

    /**
     * default constructor
     */
    public Ui5DatePicker() {
        super("ui5-date-picker");
        formatter = DateTimeFormatter.ofPattern("YYYY-MM-DD");
    }


    /**
     * sets value
     *
     * @param date date
     */
    public void setValue(LocalDate date) {
        setValue(date.format(formatter));
    }

}
