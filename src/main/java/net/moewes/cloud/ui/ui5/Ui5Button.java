package net.moewes.cloud.ui.ui5;

import java.util.function.Consumer;
import net.moewes.cloud.ui.UiComponent;

public class Ui5Button extends UiComponent {

  public enum Design {
    Default, Emphasized, Positive, Negative,  Transparent
  }

  public Ui5Button() {
    super("ui5-button");
  }

  public void setText(String text) {
    setInnerHtml(text);
  }

  public void setDesign(Design design) {
    getElement().setAttribute("design", design.name());
  }

  public void addClickHandler(Consumer<String> handler) {
    super.addEventListener("click",handler);
  }
}


