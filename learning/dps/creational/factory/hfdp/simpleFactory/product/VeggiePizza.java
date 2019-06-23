package learning.dps.creational.factory.hfdp.simpleFactory.product;

public class VeggiePizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("preparing veggie pizza");
    }

    @Override
    public void bake() {
        System.out.println("baking veggie pizza");
    }

    @Override
    public void cut() {
        System.out.println("cutting veggie pizza");
    }

    @Override
    public void box() {
        System.out.println("boxing veggie pizza");
    }

    @Override
    public String toString() {
        return "ordered veggie pizza";
    }
}
