package net.moewes.cloudui.ui5;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Java wrapper for UI5 web component ui5-datetime-picker
 */
public class Ui5DateTimePicker extends Ui5DateInputFieldBase {

    /**
     * default constructor
     */
    public Ui5DateTimePicker() {
        super("ui5-datetime-picker");
        formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    }

    /**
     * sets value as DateTime
     *
     * @param dateTime date and time
     */
    public void setValue(LocalDateTime dateTime) {
        setValue(dateTime.format(formatter));
    }
}
