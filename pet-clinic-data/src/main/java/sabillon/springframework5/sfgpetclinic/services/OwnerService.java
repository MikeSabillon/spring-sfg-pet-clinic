package sabillon.springframework5.sfgpetclinic.services;

import java.util.List;

import sabillon.springframework5.sfgpetclinic.model.Owner;

/**
 * The interface Owner service.
 */
public interface OwnerService extends CrudService<Owner, Long> {

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
