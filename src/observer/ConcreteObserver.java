/**
 * 
 */
package observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author Enrico Salvucci
 *
 */
public class ConcreteObserver implements Observer {
	
	private String text;
	
	public ConcreteObserver(String text) {
		this.text = text;
	}
	
	@Override
	public void update(Observable o, Object arg) {
		System.out.println("Concrete Observer got notified with text: " + this.text);		
	}

}
