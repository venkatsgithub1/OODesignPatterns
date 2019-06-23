package learning.dps.creational.factoryMethod.hfdp.test;

import learning.dps.creational.factoryMethod.hfdp.factory.ChicagoPizzaStore;
import learning.dps.creational.factoryMethod.hfdp.factory.NyPizzaStore;
import learning.dps.creational.factoryMethod.hfdp.factory.PizzaStore;

public class TestClass {
    public static void main(String[] args) {
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        PizzaStore nyPizzaStore = new NyPizzaStore();

        System.out.println(chicagoPizzaStore.orderPizza("veggie"));

        System.out.println(nyPizzaStore.orderPizza("cheese"));
    }
}
