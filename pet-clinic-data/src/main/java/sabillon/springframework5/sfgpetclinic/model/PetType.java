package sabillon.springframework5.sfgpetclinic.model;

/**
 * The type Pet type.
 */
public class PetType extends BaseEntity {

    /**
     * The Name.
     */
    public String name;

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
}
