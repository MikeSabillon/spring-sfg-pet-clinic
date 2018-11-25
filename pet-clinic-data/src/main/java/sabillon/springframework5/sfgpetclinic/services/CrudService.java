package sabillon.springframework5.sfgpetclinic.services;

import java.util.Set;

/**
 * The interface Crud service.
 *
 * @param <T>  the type parameter
 * @param <ID> the type parameter
 */
public interface CrudService<T,ID> {

    /**
     * Find all set.
     *
     * @return the set
     */
    Set<T> findAll();

    /**
     * Find by id t.
     *
     * @param id the id
     * @return the t
     */
    T findById(ID id);

    /**
     * Save t.
     *
     * @param t the t
     * @return the t
     */
    T save(T t);

    /**
     * Delete.
     *
     * @param t the t
     */
    void delete(T t);

    /**
     * Delete by id.
     *
     * @param id the id
     */
    void deleteById(ID id);
}
