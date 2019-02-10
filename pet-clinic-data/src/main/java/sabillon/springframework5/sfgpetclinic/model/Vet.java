package sabillon.springframework5.sfgpetclinic.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * The type Vet.
 */
@Entity
@Table(name = "vets")
public class Vet extends Person {

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "vet_specialities", joinColumns = @JoinColumn(name = "vet_id"), inverseJoinColumns = @JoinColumn(name = "speciality_id"))
    private Set<Speciality> specialities = new HashSet<>();

    /**
     * Gets specialities.
     *
     * @return the specialities
     */
    public Set<Speciality> getSpecialities() {
        return specialities;
    }

    /**
     * Sets specialities.
     *
     * @param specialities the specialities
     */
    public void setSpecialities(Set<Speciality> specialities) {
        this.specialities = specialities;
    }
}
