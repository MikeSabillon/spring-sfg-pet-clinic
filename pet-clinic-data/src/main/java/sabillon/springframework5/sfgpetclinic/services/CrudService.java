package sabillon.springframework5.sfgpetclinic.services;

import java.util.Set;

/**
 * The Interface CrudService.
 *
 * @param <T> the generic type
 * @param <I> the generic type
 */
public interface CrudService<T, I> {

	/**
	 * Find all set.
	 *
	 * @return the set
	 */
	Set<T> findAll();

	/**
	 * Find by id.
	 *
	 * @param id the id
	 * @return the t
	 */
	T findById(I id);

	/**
	 * Save.
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
	void deleteById(I id);

}
