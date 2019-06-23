package learning.dps.creational.abstractFactory.hfdp.stores;

import learning.dps.creational.abstractFactory.hfdp.products.*;

public class NyPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {

        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NyPizzaIngredientFactory();

        if (type.equalsIgnoreCase("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("ny cheese pizza");
        } else if (type.equalsIgnoreCase("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("ny clam pizza");
        }

        return pizza;
    }
}
