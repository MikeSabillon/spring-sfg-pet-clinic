package sabillon.springframework5.sfgpetclinic.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The type Owner.
 */
@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "owners")
public class Owner extends Person {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/**
	 * Instantiates a new owner.
	 *
	 * @param id        the id
	 * @param firstName the first name
	 * @param lastName  the last name
	 * @param address   the address
	 * @param city      the city
	 * @param telephone the telephone
	 * @param pets      the pets
	 */
	@Builder
	public Owner(Long id, String firstName, String lastName, String address, String city, String telephone,
			Set<Pet> pets) {
		super(id, firstName, lastName);
		this.address = address;
		this.city = city;
		this.telephone = telephone;

		if (pets != null) {
			this.pets = pets;
		}
	}

	/** The address. */
	@Column(name = "address")
	private String address;

	/** The city. */
	@Column(name = "city")
	private String city;

	/** The telephone. */
	@Column(name = "telephone")
	private String telephone;

	/** The pets. */
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
	private Set<Pet> pets = new HashSet<>();
}
