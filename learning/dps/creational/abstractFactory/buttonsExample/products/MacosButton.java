package learning.dps.creational.abstractFactory.buttonsExample.products;

/**
 * MacosButton implements Button interface
 * and has logic to paint mac button.
 */
public class MacosButton implements Button {
    @Override
    public void paint() {
        System.out.println("mac os button");
    }
}
