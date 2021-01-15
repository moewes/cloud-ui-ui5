package net.moewes.cloud.ui.ui5;

import lombok.AllArgsConstructor;
import lombok.Getter;
import net.moewes.cloud.ui.UiComponent;
import net.moewes.cloud.ui.UiElement;

public abstract class Ui5InputBase extends UiComponent {
    protected boolean readOnly;
    protected boolean disabled;

    public Ui5InputBase(String tag) {
        super(tag);
    }

    /**
     * sets readonly attribute of ui5-input
     *
     * @param readOnly flag
     */
    public void setReadOnly(boolean readOnly) {
        this.readOnly = readOnly;
    }

    /**
     * sets disabled attribute of ui5-input
     *
     * @param disabled flag
     */
    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
        if (disabled) {
            getElement().setAttribute("disabled", null);
        }
    }

    /**
     * sets value-state attribute of ui5-input
     *
     * @param valueState valueState
     */
    public void setValueState(ValueState valueState) {
        getElement().setAttribute("value-state", valueState.getText());
    }

    @Override
    public UiElement render() {

        if (readOnly) {
            getElement().setAttribute("readonly", null);
        }
        if (disabled) {
            getElement().setAttribute("disabled", null);
        }
        return super.render();
    }

    /**
     * possible values for attribute value-state of ui5-input
     */
    @AllArgsConstructor
    @Getter
    public enum ValueState {
        NONE("None"),
        ERROR("Error"),
        WARNING("Warning"),
        SUCCESS("Success"),
        INFORMATION("Information");

        private final String text;
    }
}
