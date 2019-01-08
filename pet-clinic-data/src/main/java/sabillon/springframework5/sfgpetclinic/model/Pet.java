package sabillon.springframework5.sfgpetclinic.model;

import java.time.LocalDate;

/**
 * The type Pet.
 */
public class Pet extends BaseEntity {

    private String name;
    private PetType petType;
    private Owner owner;
    private LocalDate birthDate;

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets pet type.
     *
     * @return the pet type
     */
    public PetType getPetType() {
        return petType;
    }

    /**
     * Sets pet type.
     *
     * @param petType the pet type
     */
    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    /**
     * Gets owner.
     *
     * @return the owner
     */
    public Owner getOwner() {
        return owner;
    }

    /**
     * Sets owner.
     *
     * @param owner the owner
     */
    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    /**
     * Gets birth date.
     *
     * @return the birth date
     */
    public LocalDate getBirthDate() {
        return birthDate;
    }

    /**
     * Sets birth date.
     *
     * @param birthDate the birth date
     */
    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
