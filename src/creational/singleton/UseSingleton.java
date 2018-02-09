/**
 * 
 */
package creational.singleton;

import creational.singleton.standard.Singleton;
import creational.singleton.threadSafe.SingletonTS;
import creational.singleton.withEnum.SingletonEnum;

/**
 * @author Enrico Salvucci
 *
 */
public final class UseSingleton {

	/**
     * Main method to test different types of singleton Design Pattern
	 * @param args as optional user input
	 */
	public void main(final String... args) {
		Singleton s1 = creational.singleton.standard.Singleton.getSingleton();
		s1.singletonMethod();
		
		SingletonTS s2 = SingletonTS.getSingleton();
		s2.singletonMethod();
		
		SingletonEnum s3 = SingletonEnum.getSingleton();
		s3.singletonMethod();
	}
}
