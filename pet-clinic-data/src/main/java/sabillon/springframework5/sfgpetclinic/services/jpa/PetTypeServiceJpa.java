package sabillon.springframework5.sfgpetclinic.services.jpa;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import sabillon.springframework5.sfgpetclinic.model.PetType;
import sabillon.springframework5.sfgpetclinic.repositories.PetTypeRepository;
import sabillon.springframework5.sfgpetclinic.services.PetTypeService;

@Profile("springjpa")
@Service
public class PetTypeServiceJpa implements PetTypeService {

	private final PetTypeRepository petTypeRepository;

	public PetTypeServiceJpa(PetTypeRepository petTypeRepository) {
		this.petTypeRepository = petTypeRepository;
	}

	@Override
	public Set<PetType> findAll() {
		Set<PetType> dbPetType = new HashSet<>();
		this.petTypeRepository.findAll().forEach(dbPetType::add);
		return dbPetType;
	}

	@Override
	public PetType findById(Long id) {
		Optional<PetType> dbPetType = this.petTypeRepository.findById(id);
		return dbPetType.isPresent() ? dbPetType.get() : null;
	}

	@Override
	public PetType save(PetType t) {
		return this.petTypeRepository.save(t);
	}

	@Override
	public void delete(PetType t) {
		this.petTypeRepository.delete(t);
	}

	@Override
	public void deleteById(Long id) {
		this.petTypeRepository.deleteById(id);
	}

}
