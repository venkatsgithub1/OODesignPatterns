package learning.dps.creational.factoryMethod.hfdp.product.ny;

import learning.dps.creational.factoryMethod.hfdp.product.Pizza;

public class NyStyleCheesePizza extends Pizza {
    public NyStyleCheesePizza() {
        name="NY Style sauce and cheese pizza";
        dough = "this crust dough";
        sauce="marinara sauce";
        toppings.add("Grated Reggiano cheese");
    }
}
