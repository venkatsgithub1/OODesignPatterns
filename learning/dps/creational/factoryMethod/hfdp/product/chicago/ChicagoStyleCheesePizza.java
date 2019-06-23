package learning.dps.creational.factoryMethod.hfdp.product.chicago;

import learning.dps.creational.factoryMethod.hfdp.product.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza() {
        name="NY Style sauce and cheese pizza";
        dough = "extra thick crust dough";
        sauce="plum sauce";
        toppings.add("mozzorella Reggiano cheese");
    }

    @Override
    public void cut() {
        System.out.println("cutting pizza into square pieces");
    }
}
