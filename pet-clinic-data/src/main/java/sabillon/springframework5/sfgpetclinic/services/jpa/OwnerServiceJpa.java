package sabillon.springframework5.sfgpetclinic.services.jpa;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import sabillon.springframework5.sfgpetclinic.model.Owner;
import sabillon.springframework5.sfgpetclinic.repositories.OwnerRepository;
import sabillon.springframework5.sfgpetclinic.services.OwnerService;

/**
 * The Class OwnerServiceJpa.
 */
@Profile("springjpa")
@Service
public class OwnerServiceJpa implements OwnerService {

	/** The owner repository. */
	private final OwnerRepository ownerRepository;

	/**
	 * Instantiates a new owner service jpa.
	 *
	 * @param ownerRepository the owner repository
	 */
	public OwnerServiceJpa(OwnerRepository ownerRepository) {
		this.ownerRepository = ownerRepository;
	}

	/**
	 * Find all.
	 *
	 * @return the sets the
	 */
	@Override
	public Set<Owner> findAll() {
		Set<Owner> dbOwners = new HashSet<>();
		this.ownerRepository.findAll().forEach(dbOwners::add);
		return dbOwners;
	}

	/**
	 * Find by id.
	 *
	 * @param id the id
	 * @return the owner
	 */
	@Override
	public Owner findById(Long id) {
		Optional<Owner> dbOwner = this.ownerRepository.findById(id);
		return dbOwner.isPresent() ? dbOwner.get() : null;
	}

	/**
	 * Save.
	 *
	 * @param t the t
	 * @return the owner
	 */
	@Override
	public Owner save(Owner t) {
		return this.ownerRepository.save(t);
	}

	/**
	 * Delete.
	 *
	 * @param t the t
	 */
	@Override
	public void delete(Owner t) {
		this.ownerRepository.delete(t);
	}

	/**
	 * Delete by id.
	 *
	 * @param id the id
	 */
	@Override
	public void deleteById(Long id) {
		this.ownerRepository.deleteById(id);
	}

	/**
	 * Find by last name.
	 *
	 * @param lastName the last name
	 * @return the owner
	 */
	@Override
	public Owner findByLastName(String lastName) {
		Optional<Owner> dbOwner = this.ownerRepository.findByLastName(lastName);
		return dbOwner.isPresent() ? dbOwner.get() : null;
	}

}
