package learning.dps.creational.abstractFactory;

public class ComputerAbstractFactoryTest {
	public static void main(String[] args) {
		Computer pc = ComputerFactory.getComputer(new PCFactory("16GB", "2.1GHz", "1TB"));
		Computer server = ComputerFactory.getComputer(new ServerFactory("64GB", "3.1GHz", "30TB"));

		System.out.println(pc);
		System.out.println(server);
	}
}
