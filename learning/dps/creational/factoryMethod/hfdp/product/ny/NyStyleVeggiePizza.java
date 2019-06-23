package learning.dps.creational.factoryMethod.hfdp.product.ny;

import learning.dps.creational.factoryMethod.hfdp.product.Pizza;

public class NyStyleVeggiePizza extends Pizza {
    public NyStyleVeggiePizza() {
        name="NY Style veggie pizza";
        dough = "this crust dough";
        sauce="marinara sauce";
        toppings.add("mushroom cheese");
    }
}
