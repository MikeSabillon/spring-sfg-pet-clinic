package sabillon.springframework5.sfgpetclinic.model;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * The type Visit.
 *
 * @author Miguel Sabillon in 1/7/2019
 */
@Entity
@Table(name = "visits")
public class Visit {

    @Column(name = "date")
    private LocalDate date;
    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "pet_id")
    private Pet pet;

    /**
     * Gets date.
     *
     * @return the date
     */
    public LocalDate getDate() {
        return date;
    }

    /**
     * Sets date.
     *
     * @param date the date
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /**
     * Gets description.
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets description.
     *
     * @param description the description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Gets pet.
     *
     * @return the pet
     */
    public Pet getPet() {
        return pet;
    }

    /**
     * Sets pet.
     *
     * @param pet the pet
     */
    public void setPet(Pet pet) {
        this.pet = pet;
    }

}
