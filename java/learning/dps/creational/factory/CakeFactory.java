package learning.dps.creational.factory;

public class CakeFactory {

	private static CakeFactory cakeFactoryInstance;

	private CakeFactory() {
	}

	public static CakeFactory getInstance() {
		if (cakeFactoryInstance == null) {
			cakeFactoryInstance = new CakeFactory();
		}
		return cakeFactoryInstance;
	}

	public Cake createCakeInFactory(String type) {
		if (type.equalsIgnoreCase("vanilla")) {
			return new VanillaCake();
		} else if (type.equalsIgnoreCase("butterstotch")) {
			return new ButterScotchCake();
		} else if (type.equalsIgnoreCase("chocolate")) {
			return new ChocolateCake();
		}
		if (type.equalsIgnoreCase("pineapple")) {
			return new PineappleCake();
		} else
			return new PineappleCake();
	}
}
