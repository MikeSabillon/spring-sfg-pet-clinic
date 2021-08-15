package sabillon.springframework5.sfgpetclinic.services.jpa;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import sabillon.springframework5.sfgpetclinic.model.Vet;
import sabillon.springframework5.sfgpetclinic.repositories.VetRepository;
import sabillon.springframework5.sfgpetclinic.services.VetService;

/**
 * The Class VetServiceJpa.
 */
@Profile("springjpa")
@Service
public class VetServiceJpa implements VetService {

	/** The vet repository. */
	private final VetRepository vetRepository;

	/**
	 * Instantiates a new vet service jpa.
	 *
	 * @param vetRepository the vet repository
	 */
	public VetServiceJpa(VetRepository vetRepository) {
		this.vetRepository = vetRepository;
	}

	/**
	 * Find all.
	 *
	 * @return the sets the
	 */
	@Override
	public Set<Vet> findAll() {
		Set<Vet> dbVets = new HashSet<>();
		this.vetRepository.findAll().forEach(dbVets::add);
		return dbVets;
	}

	/**
	 * Find by id.
	 *
	 * @param id the id
	 * @return the vet
	 */
	@Override
	public Vet findById(Long id) {
		Optional<Vet> dbVet = this.vetRepository.findById(id);
		return dbVet.orElse(null);
	}

	/**
	 * Save.
	 *
	 * @param t the t
	 * @return the vet
	 */
	@Override
	public Vet save(Vet t) {
		return this.vetRepository.save(t);
	}

	/**
	 * Delete.
	 *
	 * @param t the t
	 */
	@Override
	public void delete(Vet t) {
		this.vetRepository.delete(t);
	}

	/**
	 * Delete by id.
	 *
	 * @param id the id
	 */
	@Override
	public void deleteById(Long id) {
		this.vetRepository.deleteById(id);
	}

}
