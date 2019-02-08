package learning.dps.creational.abstractFactory.buttonsExample.factories;

/**
 * This method takes a keyword such as
 * string or enum or any constant from the
 * user who asks for some work to be done.
 */
public class FactoryProvider {
    public static void getInstance(String os) {
        // if os is windows, call to windows factory is issued.
        if (os.equals("windows")) {
            new WindowsFactory().paint();
        } else if (os.equals("mac")) {
            // if os is mac, call to mac factory is  issued.
            new MacosFactory().paint();
        }
    }
}
