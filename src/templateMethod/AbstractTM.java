/**
 * 
 */
package templateMethod;

/**
 * @author Enrico Salvucci
 *
 */
public abstract class AbstractTM implements TMInterface {

	public AbstractTM() {
		
	}
	
	/**
	 * This is the Template Method, or rather the method
	 * that uses abstract ones
	 */
	public void templateMethod() {
		operation1();
		operation2();
		operation3();
	}
	
	public abstract void operation1();
	public abstract void operation2();
	public abstract void operation3();
	
}
