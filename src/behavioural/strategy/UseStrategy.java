/**
 * 
 */
package behavioural.strategy;

/**
 * @author enrico
 *
 */
public class UseStrategy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Strategy s1 = new Strategy1Impl();
		// is x lower than y?
		System.out.println(s1.method(55,23));
		
		Strategy s2 = new Strategy() {
			@Override
			public boolean method(int x, int y) {
				return x > y;
			}
		};
		// Is x greater than y?
		System.out.println(s2.method(55,23));
	}

}
