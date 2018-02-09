/**
 * 
 */
package behavioural.strategy;

/**
 * @author enrico
 *
 */
public class Strategy1Impl implements Strategy {

	@Override
	public boolean method(int x, int y) {
		return x < y;
	}

}
