package creational.singleton.threadSafe;

/**
 * @author Enrico Salvucci
 * Thread safe Singleton implementation.
 */
public final class SingletonTS {

	/**
     * The singleton itself.
	 */
	private static final SingletonTS SINGLETON = null;

	/**
	 * Default private constructor.
	 */
	private SingletonTS() {
	}

    /**
     * Method that returns the singleton.
     * @return SINGLETON
     */
	public static SingletonTS getSingleton() {
		return SINGLETON == null ? new SingletonTS() : SINGLETON;
	}

    /**
     * Method of the singleton object, println as an example.
     */
	public void singletonMethod() {
		System.out.println("Into singletonMethod");
	}

}
