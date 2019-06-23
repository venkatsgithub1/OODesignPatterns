package learning.dps.creational.factory.hfdp.simpleFactory.client;

import learning.dps.creational.factory.hfdp.simpleFactory.factory.SimplePizzaFactory;
import learning.dps.creational.factory.hfdp.simpleFactory.product.Pizza;

public class PizzaStore {

    private SimplePizzaFactory pizzaFactory;

    public PizzaStore(SimplePizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

    public Pizza OrderPizza(String type) {
        Pizza pizza = pizzaFactory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
