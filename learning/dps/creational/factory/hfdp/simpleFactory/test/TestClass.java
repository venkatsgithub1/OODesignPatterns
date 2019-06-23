package learning.dps.creational.factory.hfdp.simpleFactory.test;

import learning.dps.creational.factory.hfdp.simpleFactory.client.PizzaStore;
import learning.dps.creational.factory.hfdp.simpleFactory.factory.SimplePizzaFactory;

public class TestClass {
    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();

        PizzaStore pizzaStore = new PizzaStore(factory);
        System.out.println(pizzaStore.OrderPizza("veggie"));
    }
}
