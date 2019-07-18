package sabillon.springframework5.sfgpetclinic.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * The type Owner.
 */
@Entity
@Table(name = "owners")
public class Owner extends Person {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

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

	/**
	 * Gets address.
	 *
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * Sets address.
	 *
	 * @param address the address
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * Gets city.
	 *
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Sets city.
	 *
	 * @param city the city
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * Gets telephone.
	 *
	 * @return the telephone
	 */
	public String getTelephone() {
		return telephone;
	}

	/**
	 * Sets telephone.
	 *
	 * @param telephone the telephone
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	/**
	 * Gets pets.
	 *
	 * @return the pets
	 */
	public Set<Pet> getPets() {
		return pets;
	}

	/**
	 * Sets pets.
	 *
	 * @param pets the pets
	 */
	public void setPets(Set<Pet> pets) {
		this.pets = pets;
	}
}
