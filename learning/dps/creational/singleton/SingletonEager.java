package learning.dps.creational.singleton;

public class SingletonEager {

	private static SingletonEager singletonInstance = new SingletonEager();

	private SingletonEager() {
	}

	public static SingletonEager getInstance() {
		return singletonInstance;
	}
	
	public void print() {
		System.out.println("Printing from SingletonEager class");
	}

}
