package learning.dps.creational.factory.hfdp.simpleFactory.product;

/*
 * Pizza class is the product that we are creating.
 * */
public interface Pizza {
    void prepare();

    void bake();

    void cut();

    void box();
}
