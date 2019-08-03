package sabillon.springframework5.sfgpetclinic.services.jpa;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import sabillon.springframework5.sfgpetclinic.model.Owner;
import sabillon.springframework5.sfgpetclinic.repositories.OwnerRepository;
import sabillon.springframework5.sfgpetclinic.repositories.PetRepository;
import sabillon.springframework5.sfgpetclinic.repositories.PetTypeRepository;
import sabillon.springframework5.sfgpetclinic.services.OwnerService;

/**
 * The Class OwnerServiceJpa.
 */
@Profile("springjpa")
@Service
public class OwnerServiceJpa implements OwnerService {

	private final OwnerRepository ownerRepository;
	private final PetRepository petRepository;
	private final PetTypeRepository petTypeRepository;

	public OwnerServiceJpa(OwnerRepository ownerRepository, PetRepository petRepository,
			PetTypeRepository petTypeRepository) {
		this.ownerRepository = ownerRepository;
		this.petRepository = petRepository;
		this.petTypeRepository = petTypeRepository;
	}

	@Override
	public Owner findByLastName(String lastName) {
		return this.ownerRepository.findByLastName(lastName);
	}

	@Override
	public List<Owner> findAllByLastNameLike(String lastName) {
		return this.ownerRepository.findAllByLastNameLike(lastName);
	}

	@Override
	public Set<Owner> findAll() {
		Set<Owner> owners = new HashSet<>();
		this.ownerRepository.findAll().forEach(owners::add);
		return owners;
	}

	@Override
	public Owner findById(Long aLong) {
		return this.ownerRepository.findById(aLong).orElse(null);
	}

	@Override
	public Owner save(Owner object) {
		return this.ownerRepository.save(object);
	}

	@Override
	public void delete(Owner object) {
		this.ownerRepository.delete(object);
	}

	@Override
	public void deleteById(Long aLong) {
		this.ownerRepository.deleteById(aLong);
	}

}
