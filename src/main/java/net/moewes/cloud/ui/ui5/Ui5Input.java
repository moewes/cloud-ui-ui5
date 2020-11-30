package net.moewes.cloud.ui.ui5;

import net.moewes.cloud.ui.UiComponent;

public class Ui5Input extends UiComponent {

  public Ui5Input() {
    super("ui5-input");
  }

  public void setReadOnly(boolean readOnly) {
    if (readOnly) {
      getElement().setAttribute("readonly",null);
    }
  }

  public void setDisabled(boolean disabled) {
    if (disabled) {
      getElement().setAttribute("disabled", null);
    }
  }
}
