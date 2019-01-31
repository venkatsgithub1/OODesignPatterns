package learning.dps.creational.factory.hfdp.simpleFactory.factory;

import learning.dps.creational.factory.hfdp.simpleFactory.product.*;

public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equalsIgnoreCase("veggie")) {
            pizza = new VeggiePizza();
        } else if (type.equalsIgnoreCase("pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (type.equalsIgnoreCase("clam")) {
            pizza = new ClamPizza();
        } else if (type.equalsIgnoreCase("cheese")) {
            pizza = new CheesePizza();
        }
        return pizza;
    }
}
