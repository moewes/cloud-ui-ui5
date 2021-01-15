package net.moewes.cloud.ui.ui5;

import java.util.Collection;

import net.moewes.cloud.ui.UiComponent;
import net.moewes.cloud.ui.UiElement;

/**
 * Java wraper UI% web component ui5-combobox
 */
public class Ui5ComboBox extends Ui5InputFieldBase {

    private Collection items;

    /**
     * default constructor
     */
    public Ui5ComboBox() {
        super("ui5-combobox");
    }

    // Filter -> enum
    // Filter-value ?
    // loading ?

    // setItems method(s)
    public void setItems(Collection items) {

        this.items = items;
    }

    @Override
    public UiElement render() {
        super.render();

        items.stream().forEach(item -> {
            Ui5ComboBoxItem cbItem = new Ui5ComboBoxItem();
            cbItem.getElement().setAttribute("text", item.toString());
            add(cbItem);
        });

        return getElement();
    }

    // ui5-cb-item where? in class or extra
    public class Ui5ComboBoxItem extends UiComponent {

        Ui5ComboBoxItem() {
            super("ui5-cb-item");
        }
    }
}
