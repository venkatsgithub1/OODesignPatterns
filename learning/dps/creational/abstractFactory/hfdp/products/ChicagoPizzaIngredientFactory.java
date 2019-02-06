package learning.dps.creational.abstractFactory.hfdp.products;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new Eggplant(), new Spinach(), new BlackOlives()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clam createClams() {
        return new FrozenClams();
    }

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }
}
