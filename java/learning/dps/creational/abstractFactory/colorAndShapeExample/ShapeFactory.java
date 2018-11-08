package learning.dps.creational.abstractFactory.colorAndShapeExample;

public class ShapeFactory extends AbstractFactory {

	@Override
	Color getColor(String color) {
		return null;
	}

	@Override
	Shape getShape(String shape) {
		if (shape.equalsIgnoreCase("rectangle")) {
			return new Rectangle();
		} else if (shape.equalsIgnoreCase("square")) {
			return new Square();
		} else if (shape.equalsIgnoreCase("circle")) {
			return new Circle();
		}
		return null;
	}

}
