package sabillon.springframework5.sfgpetclinic.services;

import sabillon.springframework5.sfgpetclinic.model.Owner;

/**
 * The interface Owner service.
 */
public interface OwnerService extends CrudService<Owner, Long> {

    /**
     * Find by last name owner.
     *
     * @param lastName the last name
     * @return the owner
     */
    Owner findByLastName(String lastName);

}
