package learning.dps.behavioral.strategy;

public class CreateDucks {
    public static void main(String[] args) {
        Duck rubberDuck = new RubberDuck();
        rubberDuck.performFly();

        Duck decoyDuck = new DecoyDuck();
        decoyDuck.performQuack();

        Duck redHeadDuck = new RedheadDuck();
        redHeadDuck.performFly();

        Duck mallardDuck = new MallardDuck();
        mallardDuck.performQuack();
    }
}
