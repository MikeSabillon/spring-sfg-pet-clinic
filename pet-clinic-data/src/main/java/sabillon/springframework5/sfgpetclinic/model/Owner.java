package sabillon.springframework5.sfgpetclinic.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The type Owner.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
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
	@Builder.Default
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
	private Set<Pet> pets = new HashSet<>();
}
