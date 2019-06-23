package learning.dps.creational.abstractFactory.buttonsExample.products;

/**
 * WindowsCheckbox implements Checkbox
 * and has logic to paint windows checkbox.
 */
public class WindowsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("painting windows checkbox");
    }
}
