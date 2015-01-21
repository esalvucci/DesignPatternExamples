package singleton.standard;

/**
 * @author Enrico Salvucci
 *
 */
public class Singleton {
	
	private static final Singleton SINGLETON = new Singleton();
	
	private Singleton() {
		
	}
	
	public static final Singleton getSingleton() {
		return SINGLETON;
	}
	
	public void singletonMethod() {
		System.out.println("Into singletonMethod");
	}

}
