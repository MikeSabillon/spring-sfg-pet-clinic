package sabillon.springframework5.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Miguel Sabillon in 1/8/2019
 */
@Controller
@RequestMapping("/error")
public class ErrorController {

	@GetMapping({ "/notimplemented" })
	public String notImplementedError() {
		return "notimplemented";
	}

}
