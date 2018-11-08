package learning.dps.creational.abstractFactory.colorAndShapeExample;

public class ColorFactory extends AbstractFactory {

	@Override
	Color getColor(String color) {
		if (color.equalsIgnoreCase("red")) {
			return new Red();
		} else if (color.equalsIgnoreCase("blue")) {
			return new Blue();
		} else if (color.equalsIgnoreCase("green")) {
			return new Green();
		}
		return null;
	}

	@Override
	Shape getShape(String shape) {
		return null;
	}

}
