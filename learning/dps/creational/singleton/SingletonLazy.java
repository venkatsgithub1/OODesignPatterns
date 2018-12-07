package learning.dps.creational.singleton;

public class SingletonLazy {
	private static SingletonLazy lazyInstance;

	private SingletonLazy() {
	}

	public static synchronized SingletonLazy getInstance() {
		if (lazyInstance == null) {
			lazyInstance = new SingletonLazy();
		}
		return lazyInstance;
	}

	public void print() {
		System.out.println("Printing from SingletonLazy class");
	}
}
