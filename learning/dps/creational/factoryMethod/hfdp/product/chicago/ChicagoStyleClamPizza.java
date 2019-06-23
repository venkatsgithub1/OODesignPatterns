package learning.dps.creational.factoryMethod.hfdp.product.chicago;

import learning.dps.creational.factoryMethod.hfdp.product.Pizza;

public class ChicagoStyleClamPizza extends Pizza {

    public ChicagoStyleClamPizza() {
        name="NY Style clam pizza";
        dough = "extra thick crust dough";
        sauce="plum sauce";
        toppings.add("Jalapeno cheese");
    }

    @Override
    public void cut() {
        System.out.println("cutting pizza into square pieces");
    }
}
