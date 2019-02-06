package learning.dps.creational.abstractFactory.hfdp.stores;

import learning.dps.creational.abstractFactory.hfdp.products.*;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {

        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        if (type.equalsIgnoreCase("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("chicago cheese pizza");
        } else if (type.equalsIgnoreCase("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("chicago clam pizza");
        }

        return pizza;
    }
}
