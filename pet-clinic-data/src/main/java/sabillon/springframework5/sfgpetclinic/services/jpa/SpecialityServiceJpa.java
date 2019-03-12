package sabillon.springframework5.sfgpetclinic.services.jpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import sabillon.springframework5.sfgpetclinic.model.Speciality;
import sabillon.springframework5.sfgpetclinic.repositories.SpecialityRepository;
import sabillon.springframework5.sfgpetclinic.services.SpecialityService;

@Profile("springjpa")
@Service
public class SpecialityServiceJpa implements SpecialityService {

	private final SpecialityRepository specialityRepository;

	public SpecialityServiceJpa(SpecialityRepository specialityRepository) {
		this.specialityRepository = specialityRepository;
	}

	@Override
	public Set<Speciality> findAll() {
		Set<Speciality> dbSpecialities = new HashSet<>();
		this.specialityRepository.findAll().forEach(dbSpecialities::add);
		return dbSpecialities;
	}

	@Override
	public Speciality findById(Long id) {
		return this.specialityRepository.findById(id).orElse(null);
	}

	@Override
	public Speciality save(Speciality t) {
		return this.specialityRepository.save(t);
	}

	@Override
	public void delete(Speciality t) {
		this.specialityRepository.delete(t);
	}

	@Override
	public void deleteById(Long id) {
		this.specialityRepository.deleteById(id);
	}

}
