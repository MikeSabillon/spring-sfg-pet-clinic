package sabillon.springframework5.sfgpetclinic.controllers;

import static org.hamcrest.Matchers.hasSize;
import static org.mockito.Mockito.verifyZeroInteractions;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import sabillon.springframework5.sfgpetclinic.model.Owner;
import sabillon.springframework5.sfgpetclinic.services.OwnerService;

/**
 * The Class OwnerControllerTest.
 */
@ExtendWith(MockitoExtension.class)
class OwnerControllerTest {

	/** The owner service. */
	@Mock
	private OwnerService ownerService;

	/** The owner controller. */
	@InjectMocks
	private OwnerController ownerController;

	/** The owners. */
	private Set<Owner> owners;

	/** The mock mvc. */
	private MockMvc mockMvc;

	/**
	 * Sets the up.
	 *
	 * @throws Exception the exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		this.owners = new HashSet<Owner>();
		this.owners.add(Owner.builder().id(1L).build());
		this.owners.add(Owner.builder().id(2L).build());

		this.mockMvc = MockMvcBuilders.standaloneSetup(this.ownerController).build();
	}

	/**
	 * Test list owners.
	 *
	 * @throws Exception the exception
	 */
	@Test
	void testListOwners() throws Exception {
		when(this.ownerService.findAll()).thenReturn(this.owners);
		this.mockMvc.perform(get("/owners")).andExpect(status().isOk()).andExpect(view().name("owners/index"))
				.andExpect(model().attribute("owners", hasSize(2)));
	}

	/**
	 * Test find owners.
	 *
	 * @throws Exception the exception
	 */
	@Test
	void testFindOwners() throws Exception {
		this.mockMvc.perform(get("/owners/find")).andExpect(status().isOk()).andExpect(view().name("notimplemented"));
		verifyZeroInteractions(this.ownerService);
	}

}
