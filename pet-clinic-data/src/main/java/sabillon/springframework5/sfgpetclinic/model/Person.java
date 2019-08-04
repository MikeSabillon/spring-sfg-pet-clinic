package sabillon.springframework5.sfgpetclinic.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The type Person.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
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
	 * Instantiates a new person.
	 *
	 * @param id        the id
	 * @param firstName the first name
	 * @param lastName  the last name
	 */
	public Person(Long id, String firstName, String lastName) {
		super(id);
		this.firstName = firstName;
		this.lastName = lastName;
	}

}