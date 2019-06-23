package learning.dps.creational.factoryMethod.hfdp.factory;

import learning.dps.creational.factoryMethod.hfdp.product.Pizza;
import learning.dps.creational.factoryMethod.hfdp.product.chicago.ChicagoStyleVeggiePizza;
import learning.dps.creational.factoryMethod.hfdp.product.chicago.ChicagoStyleCheesePizza;
import learning.dps.creational.factoryMethod.hfdp.product.chicago.ChicagoStyleClamPizza;
import learning.dps.creational.factoryMethod.hfdp.product.chicago.ChicagoStylePepperoniPizza;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        System.out.println("Chicago style pizza");

        Pizza pizza = null;

        if (type.equalsIgnoreCase("veggie")) {
            pizza = new ChicagoStyleVeggiePizza();
        } else if (type.equalsIgnoreCase("clam")) {
            pizza = new ChicagoStyleClamPizza();
        } else if (type.equalsIgnoreCase("cheese")) {
            pizza = new ChicagoStyleCheesePizza();
        } else if (type.equalsIgnoreCase("pepperoni")) {
            pizza = new ChicagoStylePepperoniPizza();
        }

        return pizza;
    }
}
