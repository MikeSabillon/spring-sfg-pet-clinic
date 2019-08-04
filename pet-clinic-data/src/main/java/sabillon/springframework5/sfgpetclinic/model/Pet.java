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

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The type Pet.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
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
	@Builder.Default
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "pet")
	private Set<Visit> visits = new HashSet<>();

}
