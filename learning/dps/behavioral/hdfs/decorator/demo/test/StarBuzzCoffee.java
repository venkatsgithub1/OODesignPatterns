package learning.dps.behavioral.hdfs.decorator.demo.test;

import learning.dps.behavioral.hdfs.decorator.demo.Beverage;
import learning.dps.behavioral.hdfs.decorator.demo.DarkRoast;
import learning.dps.behavioral.hdfs.decorator.demo.Espresso;
import learning.dps.behavioral.hdfs.decorator.demo.HouseBlend;
import learning.dps.behavioral.hdfs.decorator.demo.decorators.Mocha;
import learning.dps.behavioral.hdfs.decorator.demo.decorators.Soy;
import learning.dps.behavioral.hdfs.decorator.demo.decorators.Whip;

public class StarBuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();

        System.out.println("Single " + beverage.getDescription() + " costs " + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);

        System.out.println(beverage2.getDescription() + " costs " + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);

        System.out.println(beverage3.getDescription() + " costs " + beverage3.cost());

    }
}
