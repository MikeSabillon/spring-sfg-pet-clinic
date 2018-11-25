package sabillon.springframework5.sfgpetclinic.model.services;

import sabillon.springframework5.sfgpetclinic.model.Vet;

import java.util.Set;

/**
 * The interface Vet service.
 */
public interface VetService {

    /**
     * Find by id vet.
     *
     * @param id the id
     * @return the vet
     */
    Vet findById(Long id);

    /**
     * Save vet.
     *
     * @param vet the vet
     * @return the vet
     */
    Vet save(Vet vet);

    /**
     * Find all set.
     *
     * @return the set
     */
    Set<Vet> findAll();

}