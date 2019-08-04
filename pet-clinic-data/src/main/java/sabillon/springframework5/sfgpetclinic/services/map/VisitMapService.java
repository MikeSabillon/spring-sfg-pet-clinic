package sabillon.springframework5.sfgpetclinic.services.map;

import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import sabillon.springframework5.sfgpetclinic.model.Visit;
import sabillon.springframework5.sfgpetclinic.services.VisitService;

/**
 * The Class VisitMapService.
 */
@Profile({ "default", "map" })
@Service
public class VisitMapService extends AbstractMapService<Visit, Long> implements VisitService {

	/**
	 * Find all.
	 *
	 * @return the sets the
	 */
	@Override
	public Set<Visit> findAll() {
		return super.findAll();
	}

	/**
	 * Find by id.
	 *
	 * @param id the id
	 * @return the visit
	 */
	@Override
	public Visit findById(Long id) {
		return super.findById(id);
	}

	/**
	 * Save.
	 *
	 * @param t the t
	 * @return the visit
	 */
	@Override
	public Visit save(Visit visit) {
		if (visit.getPet() == null || visit.getPet().getOwner() == null || visit.getPet().getId() == null
				|| visit.getPet().getOwner().getId() == null) {
			throw new RuntimeException("Invalid visit");
		}
		return super.save(visit);
	}

	/**
	 * Delete.
	 *
	 * @param t the t
	 */
	@Override
	public void delete(Visit visit) {
		super.delete(visit);
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

}
