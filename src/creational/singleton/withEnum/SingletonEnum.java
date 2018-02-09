package creational.singleton.withEnum;

/**
 * @author Enrico Salvucci
 */
public enum SingletonEnum {

	/**
	 * The Singleton itself.
	 */
	SINGLETON;

    /**
     * Method that returns the singleton
     * @return SINGLETON
     */
	public static SingletonEnum getSingleton() {
		return SINGLETON;
	}

    /**
     * Method of the singleton object, println as an example
     */
	public void singletonMethod() {
		System.out.println("Into singletonMethod");
	}

}
