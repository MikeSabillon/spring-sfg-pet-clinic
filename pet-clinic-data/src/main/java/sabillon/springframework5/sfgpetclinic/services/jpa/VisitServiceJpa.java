package sabillon.springframework5.sfgpetclinic.services.jpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import sabillon.springframework5.sfgpetclinic.model.Visit;
import sabillon.springframework5.sfgpetclinic.repositories.VisitRepository;
import sabillon.springframework5.sfgpetclinic.services.VisitService;

/**
 * The Class VisitServiceJpa.
 */
@Profile("springjpa")
@Service
public class VisitServiceJpa implements VisitService {

	/** The Visit repository. */
	private final VisitRepository VisitRepository;

	/**
	 * Instantiates a new visit service jpa.
	 *
	 * @param visitRepository the visit repository
	 */
	public VisitServiceJpa(VisitRepository visitRepository) {
		VisitRepository = visitRepository;
	}

	/**
	 * Find all.
	 *
	 * @return the sets the
	 */
	@Override
	public Set<Visit> findAll() {
		Set<Visit> visits = new HashSet<>();
		this.VisitRepository.findAll().forEach(visits::add);
		return visits;
	}

	/**
	 * Find by id.
	 *
	 * @param id the id
	 * @return the visit
	 */
	@Override
	public Visit findById(Long id) {
		return this.VisitRepository.findById(id).orElse(null);
	}

	/**
	 * Save.
	 *
	 * @param t the t
	 * @return the visit
	 */
	@Override
	public Visit save(Visit t) {
		return this.VisitRepository.save(t);
	}

	/**
	 * Delete.
	 *
	 * @param t the t
	 */
	@Override
	public void delete(Visit t) {
		this.VisitRepository.delete(t);
	}

	/**
	 * Delete by id.
	 *
	 * @param id the id
	 */
	@Override
	public void deleteById(Long id) {
		this.VisitRepository.deleteById(id);
	}

}
