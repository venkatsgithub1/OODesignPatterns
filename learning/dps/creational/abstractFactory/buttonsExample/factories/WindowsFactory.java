package learning.dps.creational.abstractFactory.buttonsExample.factories;

import learning.dps.creational.abstractFactory.buttonsExample.products.Button;
import learning.dps.creational.abstractFactory.buttonsExample.products.Checkbox;
import learning.dps.creational.abstractFactory.buttonsExample.products.WindowsButton;
import learning.dps.creational.abstractFactory.buttonsExample.products.WindowsCheckbox;

/**
 * This class extends AbstractFactory class
 * and has windows os implementations for the Button
 * and Checkbox classes. The class has methods
 * for implementations of createButton and
 * createCheckbox methods.
 */
public class WindowsFactory extends AbstractFactory {
    /**
     * This methods creates button for windows
     * return type is abstract type button, so
     * that windows button can be returned.
     * @return
     */
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    /**
     * This method creates checkbox for windows
     * return type is abstract type checkbox, so
     * that windows checkbox can be returned.
     * @return
     */
    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
