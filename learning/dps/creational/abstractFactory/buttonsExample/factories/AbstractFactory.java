package learning.dps.creational.abstractFactory.buttonsExample.factories;

import learning.dps.creational.abstractFactory.buttonsExample.products.Button;
import learning.dps.creational.abstractFactory.buttonsExample.products.Checkbox;

/*
 * This class acts as abstract factory
 * class, from this class concrete
 * classes inherit and give their own
 * implementations for buttons.
 * */
public abstract class AbstractFactory {
    // abstract method to create button. This can be any type of button.
    public abstract Button createButton();

    // abstract method to create checkbox. This can be any type of
    // checkbox.
    public abstract Checkbox createCheckbox();

    // paint method is generic to all
    // classes, we can write implementation for this in
    // abstract class.
    void paint() {
        createButton().paint();
        createCheckbox().paint();
    }
}
