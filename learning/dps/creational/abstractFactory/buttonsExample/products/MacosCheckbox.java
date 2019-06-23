package learning.dps.creational.abstractFactory.buttonsExample.products;

/**
 * MacosCheckbox implements Checkbox
 * and has logic to paint mac os checkbox.
 */
public class MacosCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("mac os checkbox");
    }
}
