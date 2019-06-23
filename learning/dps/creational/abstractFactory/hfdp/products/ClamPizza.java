package learning.dps.creational.abstractFactory.hfdp.products;

public class ClamPizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    public ClamPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("preparing " + name);
        sauce = ingredientFactory.createSauce();
        dough = ingredientFactory.createDough();
        cheese = ingredientFactory.createCheese();
        clam = ingredientFactory.createClams();
    }
}
