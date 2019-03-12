package sabillon.springframework5.sfgpetclinic.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import sabillon.springframework5.sfgpetclinic.model.Owner;

@Repository
public interface OwnerRepository extends CrudRepository<Owner, Long> {

	Optional<Owner> findByLastName(String lastName);

}
