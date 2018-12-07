package learning.dps.creational.factory;

public class ButterScotchCake implements Cake {

	@Override
	public void prepare() {
		System.out.println("preparing butterstotch cake");
	}

	@Override
	public void bake() {
		System.out.println("baking butterstotch cake");
	}

	@Override
	public void decorate() {
		System.out.println("decorating butterstotch cake");
	}

	@Override
	public void box() {
		System.out.println("boxing butterstotch cake");
	}

}
