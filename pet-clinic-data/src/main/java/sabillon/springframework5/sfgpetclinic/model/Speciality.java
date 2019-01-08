package sabillon.springframework5.sfgpetclinic.model;

/**
 * The type Speciality.
 *
 * @author Miguel Sabillon in 1/7/2019
 */
public class Speciality extends BaseEntity {

    private String description;

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
}
