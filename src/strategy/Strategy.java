/**
 * 
 */
package strategy;

/**
 * @author enrico
 *
 */
@FunctionalInterface
public interface Strategy {
	boolean method(int x, int y);
}
