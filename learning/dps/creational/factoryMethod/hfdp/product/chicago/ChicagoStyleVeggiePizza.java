package learning.dps.creational.factoryMethod.hfdp.product.chicago;

import learning.dps.creational.factoryMethod.hfdp.product.Pizza;

public class ChicagoStyleVeggiePizza extends Pizza {

    public ChicagoStyleVeggiePizza() {
        name="NY Style veggie pizza";
        dough = "extra thick crust dough";
        sauce="plum sauce";
        toppings.add("bell pepper cheese");
    }

    @Override
    public void cut() {
        System.out.println("cutting pizza into square pieces");
    }
}
