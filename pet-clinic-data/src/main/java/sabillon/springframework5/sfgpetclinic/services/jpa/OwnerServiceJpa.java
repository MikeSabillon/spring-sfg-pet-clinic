package sabillon.springframework5.sfgpetclinic.services.jpa;

import java.util.HashSet;
import java.util.List;
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
	 * Find by last name.
	 *
	 * @param lastName the last name
	 * @return the owner
	 */
	@Override
	public Owner findByLastName(String lastName) {
		return this.ownerRepository.findByLastName(lastName);
	}

	/**
	 * Find all by last name like.
	 *
	 * @param lastName the last name
	 * @return the list
	 */
	@Override
	public List<Owner> findAllByLastNameLike(String lastName) {
		return this.ownerRepository.findAllByLastNameLike(lastName);
	}

	/**
	 * Find all.
	 *
	 * @return the sets the
	 */
	@Override
	public Set<Owner> findAll() {
		Set<Owner> owners = new HashSet<>();
		this.ownerRepository.findAll().forEach(owners::add);
		return owners;
	}

	/**
	 * Find by id.
	 *
	 * @param aLong the a long
	 * @return the owner
	 */
	@Override
	public Owner findById(Long aLong) {
		return this.ownerRepository.findById(aLong).orElse(null);
	}

	/**
	 * Save.
	 *
	 * @param object the object
	 * @return the owner
	 */
	@Override
	public Owner save(Owner object) {
		return this.ownerRepository.save(object);
	}

	/**
	 * Delete.
	 *
	 * @param object the object
	 */
	@Override
	public void delete(Owner object) {
		this.ownerRepository.delete(object);
	}

	/**
	 * Delete by id.
	 *
	 * @param aLong the a long
	 */
	@Override
	public void deleteById(Long aLong) {
		this.ownerRepository.deleteById(aLong);
	}

}
