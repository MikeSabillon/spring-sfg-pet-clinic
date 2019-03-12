package sabillon.springframework5.sfgpetclinic.services.jpa;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import sabillon.springframework5.sfgpetclinic.model.Owner;
import sabillon.springframework5.sfgpetclinic.repositories.OwnerRepository;
import sabillon.springframework5.sfgpetclinic.services.OwnerService;

@Profile("springjpa")
@Service
public class OwnerServiceJpa implements OwnerService {

	private final OwnerRepository ownerRepository;

	public OwnerServiceJpa(OwnerRepository ownerRepository) {
		this.ownerRepository = ownerRepository;
	}

	@Override
	public Set<Owner> findAll() {
		Set<Owner> dbOwners = new HashSet<>();
		this.ownerRepository.findAll().forEach(dbOwners::add);
		return dbOwners;
	}

	@Override
	public Owner findById(Long id) {
		Optional<Owner> dbOwner = this.ownerRepository.findById(id);
		return dbOwner.isPresent() ? dbOwner.get() : null;
	}

	@Override
	public Owner save(Owner t) {
		return this.ownerRepository.save(t);
	}

	@Override
	public void delete(Owner t) {
		this.ownerRepository.delete(t);
	}

	@Override
	public void deleteById(Long id) {
		this.ownerRepository.deleteById(id);
	}

	@Override
	public Owner findByLastName(String lastName) {
		Optional<Owner> dbOwner = this.ownerRepository.findByLastName(lastName);
		return dbOwner.isPresent() ? dbOwner.get() : null;
	}

}
