package learning.dps.creational.abstractFactory.colorAndShapeExample;

public class AbstractFactoryTest {

	public static void main(String[] args) {
		FactoryProducer.getFactory("shape").getShape("RECTANGLE").draw();
		FactoryProducer.getFactory("color").getColor("red").fill();
	}

}
