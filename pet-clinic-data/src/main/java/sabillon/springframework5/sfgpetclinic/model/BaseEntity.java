package sabillon.springframework5.sfgpetclinic.model;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.Setter;

/**
 * The type Base entity.
 */

/**
 * Gets the id.
 *
 * @return the id
 */
@Getter

/**
 * Sets the id.
 *
 * @param id the new id
 */
@Setter
@MappedSuperclass
public class BaseEntity implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

}
