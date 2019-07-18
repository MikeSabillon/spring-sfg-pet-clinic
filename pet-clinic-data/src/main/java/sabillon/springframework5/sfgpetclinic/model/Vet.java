package sabillon.springframework5.sfgpetclinic.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * The type Vet.
 */
@Entity
@Table(name = "vets")
public class Vet extends Person {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The specialities. */
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "vet_specialities", joinColumns = @JoinColumn(name = "vet_id"), inverseJoinColumns = @JoinColumn(name = "speciality_id"))
	private Set<Speciality> specialities = new HashSet<>();

	/**
	 * Gets specialities.
	 *
	 * @return the specialities
	 */
	public Set<Speciality> getSpecialities() {
		return specialities;
	}

	/**
	 * Sets specialities.
	 *
	 * @param specialities the specialities
	 */
	public void setSpecialities(Set<Speciality> specialities) {
		this.specialities = specialities;
	}
}
