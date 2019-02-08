package learning.dps.creational.abstractFactory.buttonsExample.test;

import learning.dps.creational.abstractFactory.buttonsExample.factories.FactoryProvider;

public class TestClass {
    public static void main(String[] args) {
        FactoryProvider.getInstance("windows");
    }
}
