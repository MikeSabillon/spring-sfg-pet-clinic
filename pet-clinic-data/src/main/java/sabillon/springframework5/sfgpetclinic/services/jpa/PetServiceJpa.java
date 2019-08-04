package sabillon.springframework5.sfgpetclinic.services.jpa;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import sabillon.springframework5.sfgpetclinic.model.Pet;
import sabillon.springframework5.sfgpetclinic.repositories.PetRepository;
import sabillon.springframework5.sfgpetclinic.services.PetService;

/**
 * The Class PetServiceJpa.
 */
@Profile("springjpa")
@Service
public class PetServiceJpa implements PetService {

	/** The pet repository. */
	private final PetRepository petRepository;

	/**
	 * Instantiates a new pet service jpa.
	 *
	 * @param petRepository the pet repository
	 */
	public PetServiceJpa(PetRepository petRepository) {
		this.petRepository = petRepository;
	}

	/**
	 * Find all.
	 *
	 * @return the sets the
	 */
	@Override
	public Set<Pet> findAll() {
		Set<Pet> dbPets = new HashSet<>();
		this.petRepository.findAll().forEach(dbPets::add);
		return dbPets;
	}

	/**
	 * Find by id.
	 *
	 * @param id the id
	 * @return the pet
	 */
	@Override
	public Pet findById(Long id) {
		Optional<Pet> dbPet = this.petRepository.findById(id);
		return dbPet.isPresent() ? dbPet.get() : null;
	}

	/**
	 * Save.
	 *
	 * @param t the t
	 * @return the pet
	 */
	@Override
	public Pet save(Pet t) {
		return this.petRepository.save(t);
	}

	/**
	 * Delete.
	 *
	 * @param t the t
	 */
	@Override
	public void delete(Pet t) {
		this.petRepository.delete(t);
	}

	/**
	 * Delete by id.
	 *
	 * @param id the id
	 */
	@Override
	public void deleteById(Long id) {
		this.petRepository.deleteById(id);
	}

}
