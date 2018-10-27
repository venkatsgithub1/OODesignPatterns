package learning.dps.creational.singleton;

public class SingletonEagerTest {

	public static void main(String[] args) {
//		SingletonEager s = new SingletonEager(); // compilation error.
		SingletonEager s = SingletonEager.getInstance();
		s.print();

//		SingletonLazy sl = new SingletonLazy(); // compilation error.
		SingletonLazy sl = SingletonLazy.getInstance();
		sl.print();
	}

}
