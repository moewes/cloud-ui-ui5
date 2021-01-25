package net.moewes.cloudui.ui5;

import java.util.Arrays;
import java.util.function.Consumer;

import net.moewes.cloudui.UiComponent;
import net.moewes.cloudui.UiEvent;
import net.moewes.cloudui.UiEventAttributeMapping;
import net.moewes.cloudui.UiEventDefinition;

/**
 * Java wrapper for UI5 web component ui5-wizard
 */
public class Ui5Wizard extends UiComponent {

    /**
     * default constructor
     */
    public Ui5Wizard() {
        super("ui5-wizard");
    }

    @Override
    public void addEventListener(String event, Consumer<UiEvent> function) {
        registerEvenrHandler(function,
                UiEventDefinition.builder().eventName(event)
                        .attributeMappings(Arrays.asList(
                                UiEventAttributeMapping.builder().fieldName("selectedStep").isHtmlElement(true).build(),
                                UiEventAttributeMapping.builder().fieldName("previouslySelectedStep").isHtmlElement(true).build()))
                        .build());
    }
}
