package learning.dps.creational.abstractFactory.buttonsExample.products;

/**
 * WindowsButton implements Button and has
 * logic to paint windows button.
 */
public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("painting windows button");
    }
}
