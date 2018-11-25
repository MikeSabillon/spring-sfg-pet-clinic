package sabillon.springframework5.sfgpetclinic.model;

import java.io.Serializable;

/**
 * The type Base entity.
 */
public class BaseEntity implements Serializable {

    private Long id;

    /**
     * Gets id.
     *
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(Long id) {
        this.id = id;
    }
}
