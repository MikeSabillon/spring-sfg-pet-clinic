package sabillon.springframework5.sfgpetclinic.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * The type Person.
 */
@MappedSuperclass
public class Person extends BaseEntity {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The first name. */
	@Column(name = "first_name")
	private String firstName;

	/** The last name. */
	@Column(name = "last_name")
	private String lastName;

	/**
	 * Gets first name.
	 *
	 * @return the first name
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets first name.
	 *
	 * @param firstName the first name
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Gets last name.
	 *
	 * @return the last name
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets last name.
	 *
	 * @param lastName the last name
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}