package sabillon.springframework5.sfgpetclinic.services.map;

import sabillon.springframework5.sfgpetclinic.model.Vet;
import sabillon.springframework5.sfgpetclinic.services.CrudService;

import java.util.Set;

/**
 * The type Vet service map.
 */
public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {


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
        return super.save(vet.getId(), vet);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
