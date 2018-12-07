package learning.dps.creational.factory;

public class ChocolateCake implements Cake {

	@Override
	public void prepare() {
		System.out.println("preparing chocolate cake");
	}

	@Override
	public void bake() {
		System.out.println("baking chocolate cake");
	}

	@Override
	public void decorate() {
		System.out.println("decorating chocolate cake");
	}

	@Override
	public void box() {
		System.out.println("boxing chocolate cake");
	}

}
