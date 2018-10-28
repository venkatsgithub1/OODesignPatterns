package learning.dps.creational.factory;

public class PineappleCake implements Cake {

	@Override
	public void prepare() {
		System.out.println("preparing pineapple cake");
	}

	@Override
	public void bake() {
		System.out.println("baking pineapple cake");
	}

	@Override
	public void decorate() {
		System.out.println("decorating pineapple cake");
	}

	@Override
	public void box() {
		System.out.println("boxing pineapple cake");
	}

}
