package sabillon.springframework5.sfgpetclinic.model.services;

import sabillon.springframework5.sfgpetclinic.model.Owner;

import java.util.Set;

/**
 * The interface Owner service.
 */
public interface OwnerService {

    /**
     * Find by last name owner.
     *
     * @param lastName the last name
     * @return the owner
     */
    Owner findByLastName(String lastName);

    /**
     * Find by id owner.
     *
     * @param id the id
     * @return the owner
     */
    Owner findById(Long id);

    /**
     * Save owner.
     *
     * @param owner the owner
     * @return the owner
     */
    Owner save(Owner owner);

    /**
     * Find all set.
     *
     * @return the set
     */
    Set<Owner> findAll();

}
