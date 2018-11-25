package sabillon.springframework5.sfgpetclinic.services.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * The type Abstract map service.
 *
 * @param <T>  the type parameter
 * @param <ID> the type parameter
 */
public abstract class AbstractMapService<T, ID> {

    /**
     * The Map.
     */
    protected Map<ID, T> map = new HashMap<>();

    /**
     * Find all set.
     *
     * @return the set
     */
    Set<T> findAll() {
        return new HashSet<>(this.map.values());
    }

    /**
     * Find by id t.
     *
     * @param id the id
     * @return the t
     */
    T findById(ID id) {
        return this.map.get(id);
    }

    /**
     * Save t.
     *
     * @param id the id
     * @param t  the t
     * @return the t
     */
    T save(ID id, T t) {
        this.map.put(id, t);
        return t;
    }

    /**
     * Delete by id.
     *
     * @param id the id
     */
    void deleteById(ID id) {
        this.map.remove(id);
    }

    /**
     * Delete.
     *
     * @param t the t
     */
    void delete(T t) {
        this.map.entrySet().removeIf(entry -> entry.getValue().equals(t));
    }

}
