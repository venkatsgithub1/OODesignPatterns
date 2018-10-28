package learning.dps.creational.factory;

public class VanillaCake implements Cake {

	@Override
	public void prepare() {
		System.out.println("preparing vanilla cake");
	}

	@Override
	public void bake() {
		System.out.println("baking vanilla cake");
	}

	@Override
	public void decorate() {
		System.out.println("decorating vanilla cake");
	}

	@Override
	public void box() {
		System.out.println("boxing vanilla cake");
	}

}
