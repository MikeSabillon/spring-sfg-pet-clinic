package sabillon.springframework5.sfgpetclinic.services.map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import sabillon.springframework5.sfgpetclinic.model.Owner;

/**
 * The Class OwnerMapServiceTest.
 */
class OwnerMapServiceTest {

	/** The pet type map service. */
	private PetTypeMapService petTypeMapService;

	/** The pet map service. */
	private PetMapService petMapService;

	/** The owner map service. */
	private OwnerMapService ownerMapService;

	/** The owner id. */
	private Long ownerId;

	/** The last name. */
	private String lastName;

	/**
	 * Sets the up.
	 *
	 * @throws Exception the exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		this.ownerId = 1L;
		this.lastName = "someLastName";
		this.petTypeMapService = new PetTypeMapService();
		this.petMapService = new PetMapService();
		this.ownerMapService = new OwnerMapService(this.petTypeMapService, this.petMapService);
		this.ownerMapService.save(Owner.builder().id(this.ownerId).lastName(this.lastName).build());
	}

	/**
	 * Test find all.
	 */
	@Test
	void testFindAll() {
		Set<Owner> ownerSet = this.ownerMapService.findAll();
		assertEquals(1, ownerSet.size());
	}

	/**
	 * Test find by id long.
	 */
	@Test
	void testFindByIdLong() {
		Owner owner = this.ownerMapService.findById(this.ownerId);
		assertEquals(this.ownerId, owner.getId());
	}

	/**
	 * Test save owner.
	 */
	@Test
	void testSaveOwner() {
		Long owner2Id = 2L;
		Owner owner2 = Owner.builder().id(owner2Id).build();
		Owner savedOwner2 = this.ownerMapService.save(owner2);
		assertEquals(owner2Id, savedOwner2.getId());
	}

	/**
	 * Test saved no id.
	 */
	@Test
	void testSavedNoId() {
		Owner noIdOwner = this.ownerMapService.save(Owner.builder().build());
		assertNotNull(noIdOwner);
		assertNotNull(noIdOwner.getId());
	}

	/**
	 * Test delete by id long.
	 */
	@Test
	void testDeleteByIdLong() {
		this.ownerMapService.delete(this.ownerMapService.findById(this.ownerId));
		assertEquals(0, this.ownerMapService.findAll().size());
	}

	/**
	 * Test delete owner.
	 */
	@Test
	void testDeleteOwner() {
		this.ownerMapService.deleteById(this.ownerId);
		assertEquals(0, this.ownerMapService.findAll().size());
	}

	/**
	 * Test find by last name.
	 */
	@Test
	void testFindByLastName() {
		Owner lastNameOwner = this.ownerMapService.findByLastName(this.lastName);
		assertNotNull(lastNameOwner);
		assertEquals(this.lastName, lastNameOwner.getLastName());
	}

}
