package net.moewes.cloudui.ui5;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import net.moewes.cloud.ui.UiElement;

/**
 * Java wrapper for UI5 web component ui5-time-picker
 */
public class Ui5TimePicker extends Ui5InputFieldBase {

    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
    private String pattern;

    /**
     * default constructor
     */
    public Ui5TimePicker() {
        super("ui5-time-picker");
    }

    public void setFormatPattern(String pattern) {

        this.formatter = DateTimeFormatter.ofPattern(pattern);
        this.pattern = pattern;
    }

    public void setValue(LocalTime time) {
        setValue(time.format(formatter));
    }

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
}
