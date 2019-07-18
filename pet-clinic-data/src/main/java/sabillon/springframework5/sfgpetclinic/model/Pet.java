package sabillon.springframework5.sfgpetclinic.model;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * The type Pet.
 */
@Entity
@Table(name = "pets")
public class Pet extends BaseEntity {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The name. */
	@Column(name = "name")
	private String name;

	/** The pet type. */
	@ManyToOne
	@JoinColumn(name = "pet_id")
	private PetType petType;

	/** The owner. */
	@ManyToOne
	@JoinColumn(name = "owner_id")
	private Owner owner;

	/** The birth date. */
	@Column(name = "birth_date")
	private LocalDate birthDate;

	/** The visits. */
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "pet")
	private Set<Visit> visits = new HashSet<>();

	/**
	 * Gets name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets name.
	 *
	 * @param name the name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets pet type.
	 *
	 * @return the pet type
	 */
	public PetType getPetType() {
		return petType;
	}

	/**
	 * Sets pet type.
	 *
	 * @param petType the pet type
	 */
	public void setPetType(PetType petType) {
		this.petType = petType;
	}

	/**
	 * Gets owner.
	 *
	 * @return the owner
	 */
	public Owner getOwner() {
		return owner;
	}

	/**
	 * Sets owner.
	 *
	 * @param owner the owner
	 */
	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	/**
	 * Gets birth date.
	 *
	 * @return the birth date
	 */
	public LocalDate getBirthDate() {
		return birthDate;
	}

	/**
	 * Sets birth date.
	 *
	 * @param birthDate the birth date
	 */
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	/**
	 * Gets visits.
	 *
	 * @return the visits
	 */
	public Set<Visit> getVisits() {
		return visits;
	}

	/**
	 * Sets visits.
	 *
	 * @param visits the visits
	 */
	public void setVisits(Set<Visit> visits) {
		this.visits = visits;
	}

}
