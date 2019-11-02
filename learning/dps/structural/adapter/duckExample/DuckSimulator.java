package learning.dps.structural.adapter.duckExample;

public class DuckSimulator {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();

        testDuck(duck);

        Turkey turkey = new BlackTurkey();

        TurkeyAdapter adapter = new TurkeyAdapter(turkey);

        testDuck(adapter);
    }

    private static void testDuck(Duck duck) {
        System.out.println("------");
        duck.fly();
        duck.quack();
        System.out.println("------");
    }
}
