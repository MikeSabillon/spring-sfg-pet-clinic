package sabillon.springframework5.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import sabillon.springframework5.sfgpetclinic.services.VetService;

/**
 * The type Vet controller.
 */
@Controller
@RequestMapping("/vets")
public class VetController {

	private final VetService vetService;

	/**
	 * Instantiates a new Vet controller.
	 *
	 * @param vetService the vet service
	 */
	public VetController(VetService vetService) {
		this.vetService = vetService;
	}

	/**
	 * List vets string.
	 *
	 * @param model the model
	 * @return the string
	 */
	@GetMapping({ "" })
	public String listVets(Model model) {
		model.addAttribute("vets", this.vetService.findAll());
		return "vets/index";
	}
}
