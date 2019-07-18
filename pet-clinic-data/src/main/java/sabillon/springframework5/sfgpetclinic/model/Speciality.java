package sabillon.springframework5.sfgpetclinic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The type Speciality.
 *
 * @author Miguel Sabillon in 1/7/2019
 */
@Entity
@Table(name = "specialities")
public class Speciality extends BaseEntity {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The description. */
	@Column(name = "description")
	private String description;

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
}
