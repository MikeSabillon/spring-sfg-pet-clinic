package sabillon.springframework5.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import sabillon.springframework5.sfgpetclinic.services.OwnerService;

/**
 * The type Owner controller.
 */
@Controller
@RequestMapping("/owners")
public class OwnerController {

	private final OwnerService ownerService;

	/**
	 * Instantiates a new Owner controller.
	 *
	 * @param ownerService the owner service
	 */
	public OwnerController(OwnerService ownerService) {
		this.ownerService = ownerService;
	}

	/**
	 * List owners string.
	 *
	 * @param model the model
	 * @return the string
	 */
	@GetMapping({ "" })
	public String listOwners(Model model) {
		model.addAttribute("owners", this.ownerService.findAll());
		return "owner/index";
	}

}
