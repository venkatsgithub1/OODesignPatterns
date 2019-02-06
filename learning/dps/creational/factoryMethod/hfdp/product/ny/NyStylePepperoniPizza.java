package learning.dps.creational.factoryMethod.hfdp.product.ny;

import learning.dps.creational.factoryMethod.hfdp.product.Pizza;

public class NyStylePepperoniPizza extends Pizza {
    public NyStylePepperoniPizza() {
        name="NY Style pepperoni pizza";
        dough = "this crust dough";
        sauce="marinara sauce";
        toppings.add("Bell pepper cheese");
    }
}
