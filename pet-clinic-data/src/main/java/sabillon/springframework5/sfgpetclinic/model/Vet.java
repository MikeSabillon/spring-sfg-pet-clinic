package sabillon.springframework5.sfgpetclinic.model;

import java.util.HashSet;
import java.util.Set;

/**
 * The type Vet.
 */
public class Vet extends Person {

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
