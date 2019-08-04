package sabillon.springframework5.sfgpetclinic.services.map;

import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import sabillon.springframework5.sfgpetclinic.model.Pet;
import sabillon.springframework5.sfgpetclinic.services.PetService;

/**
 * The type Pet map service.
 */
@Profile({ "default", "map" })
@Service
public class PetMapService extends AbstractMapService<Pet, Long> implements PetService {
	@Override
	public Set<Pet> findAll() {
		return super.findAll();
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public void delete(Pet pet) {
		super.delete(pet);
	}

	@Override
	public Pet save(Pet pet) {
		return super.save(pet);
	}

	@Override
	public Pet findById(Long id) {
		return super.findById(id);
	}
}
