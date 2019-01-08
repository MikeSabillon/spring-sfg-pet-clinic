package sabillon.springframework5.sfgpetclinic.services.map;

import org.springframework.stereotype.Service;
import sabillon.springframework5.sfgpetclinic.model.Speciality;
import sabillon.springframework5.sfgpetclinic.services.SpecialityService;

import java.util.Set;

/**
 * The type Speciality map service.
 *
 * @author Miguel Sabillon in 1/7/2019
 */
@Service
public class SpecialityMapService extends AbstractMapService<Speciality, Long> implements SpecialityService {
    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Speciality t) {
        super.delete(t);
    }

    @Override
    public Speciality save(Speciality t) {
        return super.save(t);
    }

    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }

}
