package sabillon.springframework5.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * The type Index controller.
 */
@Controller
public class IndexController {

	/**
	 * Index string.
	 *
	 * @return the string
	 */
	@GetMapping({ "", "/", "index", "index.html" })
	public String index() {
		return "index";
	}
}
