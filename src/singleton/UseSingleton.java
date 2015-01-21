/**
 * 
 */
package singleton;

import singleton.standard.Singleton;
import singleton.threadSafe.SingletonTS;
import singleton.withEnum.SingletonEnum;

/**
 * @author Enrico Salvucci
 *
 */
public class UseSingleton {

	public void main(String[] args) {
		Singleton s1 = singleton.standard.Singleton.getSingleton();
		s1.singletonMethod();
		
		SingletonTS s2 = SingletonTS.getSingleton();
		s2.singletonMethod();
		
		SingletonEnum s3 = SingletonEnum.getSingleton();
		s3.singletonMethod();
	}
}
