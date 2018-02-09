/**
 * 
 */
package behavioural.templateMethod;

/**
 * @author enrico
 *
 */
public class ConcreteTM extends AbstractTM {

	public ConcreteTM() {
		super();
	}

	@Override
	public void operation1() {
		System.out.println("Method number 1");
	}

	@Override
	public void operation2() {
		System.out.println("Method number 2");		
	}

	@Override
	public void operation3() {
		System.out.println("Method number 3");		
	}

}
