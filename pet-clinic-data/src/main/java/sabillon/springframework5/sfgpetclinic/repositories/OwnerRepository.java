package sabillon.springframework5.sfgpetclinic.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import sabillon.springframework5.sfgpetclinic.model.Owner;

/**
 * The Interface OwnerRepository.
 */
@Repository
public interface OwnerRepository extends CrudRepository<Owner, Long> {

	/**
	 * Find by last name.
	 *
	 * @param lastName the last name
	 * @return the owner
	 */
	Owner findByLastName(String lastName);

	/**
	 * Find all by last name like.
	 *
	 * @param lastName the last name
	 * @return the list
	 */
	List<Owner> findAllByLastNameLike(String lastName);

}
