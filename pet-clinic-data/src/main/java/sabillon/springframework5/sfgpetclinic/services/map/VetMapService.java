package sabillon.springframework5.sfgpetclinic.services.map;

import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import sabillon.springframework5.sfgpetclinic.model.Vet;
import sabillon.springframework5.sfgpetclinic.services.VetService;

/**
 * The type Vet map service.
 */
@Profile({ "default", "map" })
@Service
public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {
	@Override
	public Set<Vet> findAll() {
		return super.findAll();
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public void delete(Vet vet) {
		super.delete(vet);
	}

	@Override
	public Vet save(Vet vet) {
		return super.save(vet);
	}

	@Override
	public Vet findById(Long id) {
		return super.findById(id);
	}
}
