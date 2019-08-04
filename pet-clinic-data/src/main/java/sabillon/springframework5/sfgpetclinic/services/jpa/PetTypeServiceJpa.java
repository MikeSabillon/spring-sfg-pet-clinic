package sabillon.springframework5.sfgpetclinic.services.jpa;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import sabillon.springframework5.sfgpetclinic.model.PetType;
import sabillon.springframework5.sfgpetclinic.repositories.PetTypeRepository;
import sabillon.springframework5.sfgpetclinic.services.PetTypeService;

/**
 * The Class PetTypeServiceJpa.
 */
@Profile("springjpa")
@Service
public class PetTypeServiceJpa implements PetTypeService {

	/** The pet type repository. */
	private final PetTypeRepository petTypeRepository;

	/**
	 * Instantiates a new pet type service jpa.
	 *
	 * @param petTypeRepository the pet type repository
	 */
	public PetTypeServiceJpa(PetTypeRepository petTypeRepository) {
		this.petTypeRepository = petTypeRepository;
	}

	/**
	 * Find all.
	 *
	 * @return the sets the
	 */
	@Override
	public Set<PetType> findAll() {
		Set<PetType> dbPetType = new HashSet<>();
		this.petTypeRepository.findAll().forEach(dbPetType::add);
		return dbPetType;
	}

	/**
	 * Find by id.
	 *
	 * @param id the id
	 * @return the pet type
	 */
	@Override
	public PetType findById(Long id) {
		Optional<PetType> dbPetType = this.petTypeRepository.findById(id);
		return dbPetType.isPresent() ? dbPetType.get() : null;
	}

	/**
	 * Save.
	 *
	 * @param t the t
	 * @return the pet type
	 */
	@Override
	public PetType save(PetType t) {
		return this.petTypeRepository.save(t);
	}

	/**
	 * Delete.
	 *
	 * @param t the t
	 */
	@Override
	public void delete(PetType t) {
		this.petTypeRepository.delete(t);
	}

	/**
	 * Delete by id.
	 *
	 * @param id the id
	 */
	@Override
	public void deleteById(Long id) {
		this.petTypeRepository.deleteById(id);
	}

}
