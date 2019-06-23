package learning.dps.creational.abstractFactory.hfdp.test;

import learning.dps.creational.abstractFactory.hfdp.stores.NyPizzaStore;
import learning.dps.creational.abstractFactory.hfdp.stores.PizzaStore;

public class TestClass {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new NyPizzaStore();
        System.out.println(pizzaStore.orderPizza("cheese"));
    }

}
