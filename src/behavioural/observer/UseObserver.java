/**
 * 
 */
package behavioural.observer;

/**
 * @author Enrico Salvucci
 *
 */
public class UseObserver {

	public static void main(String[] args) {
		SubjectImpl s1 = new SubjectImpl();
		s1.addObserver(new ConcreteObserver("Example"));
		s1.addObserver(new ConcreteObserver("Example 2"));

		s1.sendAllMessages();
	}

}
