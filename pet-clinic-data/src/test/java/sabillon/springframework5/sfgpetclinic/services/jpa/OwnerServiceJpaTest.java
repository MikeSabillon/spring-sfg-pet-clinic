package sabillon.springframework5.sfgpetclinic.services.jpa;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import sabillon.springframework5.sfgpetclinic.model.Owner;
import sabillon.springframework5.sfgpetclinic.repositories.OwnerRepository;

/**
 * The Class OwnerServiceJpaTest.
 */
@ExtendWith(MockitoExtension.class)
class OwnerServiceJpaTest {

	/** The Constant SOME_LAST_NAME. */
	private static final String SOME_LAST_NAME = "someLastName";

	/** The owner repository. */
	@Mock
	private OwnerRepository ownerRepository;

	/** The owner service jpa. */
	@InjectMocks
	private OwnerServiceJpa ownerServiceJpa;

	/**
	 * Sets the up.
	 *
	 * @throws Exception the exception
	 */
	@BeforeEach
	void setUp() throws Exception {

	}

	/**
	 * Test find all.
	 */
	@Test
	void testFindAll() {
		Set<Owner> owners = new HashSet<Owner>();
		owners.add(Owner.builder().id(1L).build());
		owners.add(Owner.builder().id(2L).build());
		when(this.ownerRepository.findAll()).thenReturn(owners);
		Set<Owner> dbOwners = this.ownerServiceJpa.findAll();
		assertNotNull(dbOwners);
		assertFalse(dbOwners.isEmpty());
		assertEquals(2, dbOwners.size());
		verify(this.ownerRepository).findAll();
	}

	/**
	 * Test find by id.
	 */
	@Test
	void testFindById() {
		Optional<Owner> optionalOwner = Optional.of(Owner.builder().id(1L).build());
		when(this.ownerRepository.findById(Mockito.anyLong())).thenReturn(optionalOwner);
		Owner dbOwner = this.ownerServiceJpa.findById(1L);
		assertNotNull(dbOwner);
		assertEquals(Long.valueOf(1L), dbOwner.getId());
		verify(this.ownerRepository).findById(Mockito.anyLong());
	}

	/**
	 * Test find by id not found.
	 */
	@Test
	void testFindByIdNotFound() {
		when(this.ownerRepository.findById(Mockito.anyLong())).thenReturn(Optional.empty());
		Owner dbOwner = this.ownerServiceJpa.findById(1L);
		assertNull(dbOwner);
		verify(this.ownerRepository).findById(Mockito.anyLong());
	}

	/**
	 * Test save.
	 */
	@Test
	void testSave() {
		when(this.ownerRepository.save(Mockito.any(Owner.class))).thenReturn(Owner.builder().id(1L).build());
		Owner dbOwner = this.ownerServiceJpa.save(Owner.builder().build());
		assertNotNull(dbOwner);
		assertEquals(Long.valueOf(1L), dbOwner.getId());
		verify(this.ownerRepository).save(Mockito.any(Owner.class));
	}

	/**
	 * Test delete.
	 */
	@Test
	void testDelete() {
		this.ownerServiceJpa.delete(Owner.builder().id(1L).build());
		verify(this.ownerRepository).delete(Mockito.any(Owner.class));
	}

	/**
	 * Test delete by id.
	 */
	@Test
	void testDeleteById() {
		this.ownerServiceJpa.deleteById(1L);
		verify(this.ownerRepository).deleteById(Mockito.anyLong());
	}

	/**
	 * Test find by last name.
	 */
	@Test
	void testFindByLastName() {
		Owner returnOwner = Owner.builder().id(1L).lastName(SOME_LAST_NAME).build();
		when(this.ownerRepository.findByLastName(SOME_LAST_NAME)).thenReturn(returnOwner);
		Owner dbOwner = this.ownerServiceJpa.findByLastName(SOME_LAST_NAME);
		assertNotNull(dbOwner);
		assertEquals(SOME_LAST_NAME, dbOwner.getLastName());
		verify(this.ownerRepository).findByLastName(Mockito.anyString());
	}

}
