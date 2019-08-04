package sabillon.springframework5.sfgpetclinic.services.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

import sabillon.springframework5.sfgpetclinic.model.BaseEntity;

/**
 * The type Abstract map service.
 *
 * @param <T> the type parameter
 * @param <I> the type parameter
 */
public abstract class AbstractMapService<T extends BaseEntity, I extends Long> {

	/**
	 * The Map.
	 */
	protected Map<Long, T> map = new HashMap<>();

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
	T findById(I id) {
		return this.map.get(id);
	}

	/**
	 * Save t.
	 *
	 * @param t the t
	 * @return the t
	 */
	T save(T t) {
		if (t != null) {
			if (t.getId() == null) {
				t.setId(this.getNextId());
			}
			this.map.put(t.getId(), t);
		} else {
			throw new RuntimeException("Object cannot be null");
		}
		return t;
	}

	/**
	 * Delete by id.
	 *
	 * @param id the id
	 */
	void deleteById(I id) {
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

	/**
	 * Gets the next id.
	 *
	 * @return the next id
	 */
	private Long getNextId() {

		Long nextId = null;

		try {
			nextId = Collections.max(this.map.keySet()) + 1;
		} catch (NoSuchElementException e) {
			nextId = 1l;
		}

		return nextId;
	}

}
