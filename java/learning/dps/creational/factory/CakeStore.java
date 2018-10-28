package learning.dps.creational.factory;

public class CakeStore {
	private CakeFactory cakeFactory;

	public CakeStore() {
		this.cakeFactory = CakeFactory.getInstance();
	}

	public Cake createCake(String type) {
		Cake cake = cakeFactory.createCakeInFactory(type);

		cake.prepare();
		cake.bake();
		cake.decorate();
		cake.box();

		return cake;
	}
}
