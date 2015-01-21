package singleton.threadSafe;

/**
 * @author Enrico Salvucci
 *
 */
public class SingletonTS {
	
	private static final SingletonTS SINGLETON = null;
	
	private SingletonTS() {
		
	}
	
	public static final SingletonTS getSingleton() {
		return SINGLETON == null ? new SingletonTS() : SINGLETON;
	}
	
	public void singletonMethod() {
		System.out.println("Into singletonMethod");
	}

}
