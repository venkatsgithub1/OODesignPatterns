package learning.dps.creational.factoryMethod.hfdp.product;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

    protected String name;
    protected String dough;
    protected String sauce;
    protected List<String> toppings = new ArrayList<>();

    public void prepare() {
        System.out.println("preparing " + name);
        System.out.println("tossing dough");
        System.out.println("adding sauce");
        System.out.println("adding toppings - ");
        for (String topping : toppings) {
            System.out.println("topping: " + topping);
        }
    }

    public void bake() {
        System.out.println("Bake for 20 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting pizza into traingles");
    }

    public void box() {
        System.out.println("Pizza into a box");
    }

    String getName() {
        return name;
    }
}
