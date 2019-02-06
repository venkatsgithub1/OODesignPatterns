package learning.dps.creational.factoryMethod.hfdp.product.chicago;

import learning.dps.creational.factoryMethod.hfdp.product.Pizza;

public class ChicagoStylePepperoniPizza extends Pizza {

    public ChicagoStylePepperoniPizza() {
        name="NY Style pepperoni pizza";
        dough = "extra thick crust dough";
        sauce="plum sauce";
        toppings.add("mushroom cheese");
    }

    @Override
    public void cut() {
        System.out.println("cutting pizza into square pieces");
    }
}
