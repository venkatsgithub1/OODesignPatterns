package learning.dps.creational.factoryMethod.hfdp.product.ny;

import learning.dps.creational.factoryMethod.hfdp.product.Pizza;

public class NyStyleClamPizza extends Pizza {
    public NyStyleClamPizza() {
        name="NY Style clam pizza";
        dough = "this crust dough";
        sauce="marinara sauce";
        toppings.add("Jalapeno Reggiano cheese");
    }
}
