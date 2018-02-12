package creational.singleton.threadSafe;

/**
 * @author Enrico Salvucci
 * Thread safe Singleton implementation according to Mirko Viroli example during OOP lessons.
 */
public final class SingletonTS {

    /**
     * The singleton itself.
     */
    private static SingletonTS SINGLETON = null;

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
        if (SINGLETON == null) {
            synchronized (SingletonTS.class) {
                if (SINGLETON == null) {
                    SINGLETON = new SingletonTS();
                }
            }
        }

        return SINGLETON;
    }

    /**
     * Method of the singleton object, println as an example.
     */
    public void singletonMethod() {
        System.out.println("Into singletonMethod");
    }

}
