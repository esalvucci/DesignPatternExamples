/**
 * 
 */
package observer;

import java.util.HashSet;
import java.util.Observable;
import java.util.Observer;
import java.util.Set;

public class SubjectImpl extends Observable implements Subject {
	/**
	 * Observers collection.
	 */
	private Set<Observer> observers = new HashSet<>();

	@Override
	public final void addObserver(final Observer o) {
		this.observers.add(o);
		System.out.println("Observer set size: " + observers.size());
	}
	
	public void sendAllMessages() {
		this.notifyAllObserver(null);
	}
	
	@Override
	public final void notifyAllObserver(final Object arg) {
		for (Observer obs : this.observers) {
			obs.update(this, arg);
		}
	}
}
