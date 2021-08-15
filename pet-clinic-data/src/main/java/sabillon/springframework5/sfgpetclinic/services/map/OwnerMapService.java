package sabillon.springframework5.sfgpetclinic.services.map;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import sabillon.springframework5.sfgpetclinic.model.Owner;
import sabillon.springframework5.sfgpetclinic.model.Pet;
import sabillon.springframework5.sfgpetclinic.services.OwnerService;
import sabillon.springframework5.sfgpetclinic.services.PetService;
import sabillon.springframework5.sfgpetclinic.services.PetTypeService;

/**
 * The type Owner map service.
 */
@Profile({ "default", "map" })
@Service
public class OwnerMapService extends AbstractMapService<Owner, Long> implements OwnerService {

	/** The pet type service. */
	private final PetTypeService petTypeService;

	/** The pet service. */
	private final PetService petService;

	/**
	 * Instantiates a new owner map service.
	 *
	 * @param petTypeService the pet type service
	 * @param petService     the pet service
	 */
	public OwnerMapService(PetTypeService petTypeService, PetService petService) {
		this.petTypeService = petTypeService;
		this.petService = petService;
	}

	/**
	 * Find all.
	 *
	 * @return the sets the
	 */
	@Override
	public Set<Owner> findAll() {
		return super.findAll();
	}

	/**
	 * Delete by id.
	 *
	 * @param id the id
	 */
	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	/**
	 * Delete.
	 *
	 * @param owner the owner
	 */
	@Override
	public void delete(Owner owner) {
		super.delete(owner);
	}

	/**
	 * Save.
	 *
	 * @param owner the owner
	 * @return the owner
	 */
	@Override
	public Owner save(Owner owner) {
		if (owner != null) {
			if (owner.getPets() != null && !owner.getPets().isEmpty()) {
				owner.getPets().forEach(pet -> {
					if (pet.getPetType() != null) {
						if (pet.getPetType().getId() == null) {
							pet.setPetType(this.petTypeService.save(pet.getPetType()));
						}
					} else {
						throw new RuntimeException("Pet type is required.");
					}

					if (pet.getId() == null) {
						Pet savedPet = this.petService.save(pet);
						pet.setId(savedPet.getId());
					}
				});
			}
			return super.save(owner);
		}
		return null;
	}

	/**
	 * Find by id.
	 *
	 * @param id the id
	 * @return the owner
	 */
	@Override
	public Owner findById(Long id) {
		return super.findById(id);
	}

	/**
	 * Find by last name.
	 *
	 * @param lastName the last name
	 * @return the owner
	 */
	@Override
	public Owner findByLastName(String lastName) {
		return this.findAll().stream().filter(owner -> owner.getLastName().equalsIgnoreCase(lastName)).findFirst()
				.orElse(null);
	}

	/**
	 * Find all by last name like.
	 *
	 * @param lastName the last name
	 * @return the list
	 */
	@Override
	public List<Owner> findAllByLastNameLike(String lastName) {
		// todo - impl
		return new ArrayList<>();
	}

}
