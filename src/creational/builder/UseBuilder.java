/**
 * 
 */
package creational.builder;

/**
 * @author Enrico Salvucci
 *
 */
public final class UseBuilder {

    /**
     * Default private constructor
     */
	private UseBuilder() {

    }

	/**
	 * @param args
	 */
	public static void main(final String... args) {
		Person p1 = new PersonImpl();
		p1.setName("Pierino");
		p1.setSurname("Pieri");
		System.out.println(p1.toString());

		Person p2 = new PersonImpl()
					.setName("Giorgino")
					.setSurname("Giorgi")
					.setMarried(true);
		System.out.println(p2.toString());

	}

}
