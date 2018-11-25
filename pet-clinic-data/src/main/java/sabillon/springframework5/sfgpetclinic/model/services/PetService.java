package sabillon.springframework5.sfgpetclinic.model.services;

import sabillon.springframework5.sfgpetclinic.model.Pet;

import java.util.Set;

/**
 * The interface Pet service.
 */
public interface PetService {

    /**
     * Find by id pet.
     *
     * @param id the id
     * @return the pet
     */
    Pet findById(Long id);

    /**
     * Save pet.
     *
     * @param pet the pet
     * @return the pet
     */
    Pet Save(Pet pet);

    /**
     * Find all set.
     *
     * @return the set
     */
    Set<Pet> findAll();

}
