/**
 * 
 */
package observer;

import java.util.Observer;

/**
 * @author Enrico Salvucci
 *
 *         This is the subject interface, according to Observer/Observable
 *         Pattern
 */
public interface Subject {
	/**
	 * @param obs
	 * This method add an Observer to observer list
	 */
	void addObserver(final Observer obs);

	/**
	 * @param arg
	 * This method notify all Observer when a change happens
	 */
	void notifyAllObserver(final Object arg);
}