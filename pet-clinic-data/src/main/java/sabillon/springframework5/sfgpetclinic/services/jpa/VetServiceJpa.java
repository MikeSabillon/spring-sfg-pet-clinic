package sabillon.springframework5.sfgpetclinic.services.jpa;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import sabillon.springframework5.sfgpetclinic.model.Vet;
import sabillon.springframework5.sfgpetclinic.repositories.VetRepository;
import sabillon.springframework5.sfgpetclinic.services.VetService;

@Profile("springjpa")
@Service
public class VetServiceJpa implements VetService {

	private final VetRepository vetRepository;

	public VetServiceJpa(VetRepository vetRepository) {
		this.vetRepository = vetRepository;
	}

	@Override
	public Set<Vet> findAll() {
		Set<Vet> dbVets = new HashSet<>();
		this.vetRepository.findAll().forEach(dbVets::add);
		return dbVets;
	}

	@Override
	public Vet findById(Long id) {
		Optional<Vet> dbVet = this.vetRepository.findById(id);
		return dbVet.isPresent() ? dbVet.get() : null;
	}

	@Override
	public Vet save(Vet t) {
		return this.vetRepository.save(t);
	}

	@Override
	public void delete(Vet t) {
		this.vetRepository.delete(t);
	}

	@Override
	public void deleteById(Long id) {
		this.vetRepository.deleteById(id);
	}

}
