package learning.dps.creational.abstractFactory.buttonsExample.factories;

import learning.dps.creational.abstractFactory.buttonsExample.products.Button;
import learning.dps.creational.abstractFactory.buttonsExample.products.Checkbox;
import learning.dps.creational.abstractFactory.buttonsExample.products.MacosButton;
import learning.dps.creational.abstractFactory.buttonsExample.products.MacosCheckbox;

/**
 * Mac os factory is a concrete class, it inherits from
 * abstract factory, implementation for
 * create button and create checkbox
 * methods specifically is written here.
 */
public class MacosFactory extends AbstractFactory {

    /**
     * This method creates a mac button and returns
     * button, return type is abstract type button.
     * @return
     */
    @Override
    public Button createButton() {
        return new MacosButton();
    }

    /**
     * This method creates a mac checkbox and returns
     * checkbox, return type is abstract type
     * checkbox.
     * @return
     */
    @Override
    public Checkbox createCheckbox() {
        return new MacosCheckbox();
    }
}
