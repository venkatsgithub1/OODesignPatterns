package learning.dps.creational.abstractFactory.hfdp.products;

public interface PizzaIngredientFactory {
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clam createClams();
    Dough createDough();
}
