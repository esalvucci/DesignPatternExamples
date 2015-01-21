package singleton.withEnum;

/**
 * @author Enrico Salvucci
 *
 */
public enum SingletonEnum {
	
	SINGLETON;
		
	public static final SingletonEnum getSingleton() {
		return SINGLETON;
	}
	
	public void singletonMethod() {
		System.out.println("Into singletonMethod");
	}

}
