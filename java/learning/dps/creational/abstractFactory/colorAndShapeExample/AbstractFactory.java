package learning.dps.creational.abstractFactory.colorAndShapeExample;

public abstract class AbstractFactory {
	abstract Color getColor(String color);
	abstract Shape getShape(String shape);
}
