package sabillon.springframework5.sfgpetclinic.services.jpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import sabillon.springframework5.sfgpetclinic.model.Speciality;
import sabillon.springframework5.sfgpetclinic.repositories.SpecialityRepository;
import sabillon.springframework5.sfgpetclinic.services.SpecialityService;

/**
 * The Class SpecialityServiceJpa.
 */
@Profile("springjpa")
@Service
public class SpecialityServiceJpa implements SpecialityService {

	/** The speciality repository. */
	private final SpecialityRepository specialityRepository;

	/**
	 * Instantiates a new speciality service jpa.
	 *
	 * @param specialityRepository the speciality repository
	 */
	public SpecialityServiceJpa(SpecialityRepository specialityRepository) {
		this.specialityRepository = specialityRepository;
	}

	/**
	 * Find all.
	 *
	 * @return the sets the
	 */
	@Override
	public Set<Speciality> findAll() {
		Set<Speciality> dbSpecialities = new HashSet<>();
		this.specialityRepository.findAll().forEach(dbSpecialities::add);
		return dbSpecialities;
	}

	/**
	 * Find by id.
	 *
	 * @param id the id
	 * @return the speciality
	 */
	@Override
	public Speciality findById(Long id) {
		return this.specialityRepository.findById(id).orElse(null);
	}

	/**
	 * Save.
	 *
	 * @param t the t
	 * @return the speciality
	 */
	@Override
	public Speciality save(Speciality t) {
		return this.specialityRepository.save(t);
	}

	/**
	 * Delete.
	 *
	 * @param t the t
	 */
	@Override
	public void delete(Speciality t) {
		this.specialityRepository.delete(t);
	}

	/**
	 * Delete by id.
	 *
	 * @param id the id
	 */
	@Override
	public void deleteById(Long id) {
		this.specialityRepository.deleteById(id);
	}

}
