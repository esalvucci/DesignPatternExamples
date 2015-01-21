/**
 * 
 */
package builder;

/**
 * @author enrico
 *
 */
public class PersonImpl implements Person {
	
	private String name;
	private String surname;
	private boolean married;

	@Override
	public Person setName(String newName) {
		this.name = newName;
		return this;
	}

	@Override
	public Person setSurname(String newSurname) {
		this.surname = newSurname;
		return this;
	}

	@Override
	public Person setMarried(boolean newMarried) {
		this.married = newMarried;
		return this;
	}
	
	@Override
	public Person getPerson() {
//		return new PersonImpl().setName(this.name).setSurname(this.surname);
		return this;
	}
	
	public String toString() {
		return "Name: " + this.name
				+ " Surname: " + this.surname
				+ " - Is married? " + this.married;
	}
}
