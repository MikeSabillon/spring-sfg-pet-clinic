package sabillon.springframework5.sfgpetclinic.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The type Visit.
 *
 * @author Miguel Sabillon in 1/7/2019
 */
@Entity
@Table(name = "visits")
public class Visit extends BaseEntity {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The date. */
	@Column(name = "date")
	private LocalDate date;

	/** The description. */
	@Column(name = "description")
	private String description;

	/** The pet. */
	@ManyToOne
	@JoinColumn(name = "pet_id")
	private Pet pet;

	/**
	 * Gets date.
	 *
	 * @return the date
	 */
	public LocalDate getDate() {
		return date;
	}

	/**
	 * Sets date.
	 *
	 * @param date the date
	 */
	public void setDate(LocalDate date) {
		this.date = date;
	}

	/**
	 * Gets description.
	 *
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets description.
	 *
	 * @param description the description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Gets pet.
	 *
	 * @return the pet
	 */
	public Pet getPet() {
		return pet;
	}

	/**
	 * Sets pet.
	 *
	 * @param pet the pet
	 */
	public void setPet(Pet pet) {
		this.pet = pet;
	}

}
