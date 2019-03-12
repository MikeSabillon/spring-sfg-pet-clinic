package sabillon.springframework5.sfgpetclinic.services.jpa;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import sabillon.springframework5.sfgpetclinic.model.Pet;
import sabillon.springframework5.sfgpetclinic.repositories.PetRepository;
import sabillon.springframework5.sfgpetclinic.services.PetService;

@Profile("springjpa")
@Service
public class PetServiceJpa implements PetService {

	private final PetRepository petRepository;

	public PetServiceJpa(PetRepository petRepository) {
		this.petRepository = petRepository;
	}

	@Override
	public Set<Pet> findAll() {
		Set<Pet> dbPets = new HashSet<>();
		this.petRepository.findAll().forEach(dbPets::add);
		return dbPets;
	}

	@Override
	public Pet findById(Long id) {
		Optional<Pet> dbPet = this.petRepository.findById(id);
		return dbPet.isPresent() ? dbPet.get() : null;
	}

	@Override
	public Pet save(Pet t) {
		return this.petRepository.save(t);
	}

	@Override
	public void delete(Pet t) {
		this.petRepository.delete(t);
	}

	@Override
	public void deleteById(Long id) {
		this.petRepository.deleteById(id);
	}

}
