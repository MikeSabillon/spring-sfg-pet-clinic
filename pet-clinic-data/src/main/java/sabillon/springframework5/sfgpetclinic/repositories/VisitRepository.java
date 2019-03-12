package sabillon.springframework5.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import sabillon.springframework5.sfgpetclinic.model.Visit;

@Repository
public interface VisitRepository extends CrudRepository<Visit, Long> {

}
