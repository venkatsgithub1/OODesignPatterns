package learning.dps.creational.factoryMethod.hfdp.factory;

import learning.dps.creational.factoryMethod.hfdp.product.Pizza;
import learning.dps.creational.factoryMethod.hfdp.product.ny.NyStyleCheesePizza;
import learning.dps.creational.factoryMethod.hfdp.product.ny.NyStyleClamPizza;
import learning.dps.creational.factoryMethod.hfdp.product.ny.NyStylePepperoniPizza;
import learning.dps.creational.factoryMethod.hfdp.product.ny.NyStyleVeggiePizza;

public class NyPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {

        System.out.println("Ny style pizza");

        Pizza pizza = null;

        if (type.equalsIgnoreCase("veggie")) {
            pizza = new NyStyleVeggiePizza();
        } else if (type.equalsIgnoreCase("clam")) {
            pizza = new NyStyleClamPizza();
        } else if (type.equalsIgnoreCase("cheese")) {
            pizza = new NyStyleCheesePizza();
        } else if (type.equalsIgnoreCase("pepperoni")) {
            pizza = new NyStylePepperoniPizza();
        }

        return pizza;
    }
}
