package sabillon.springframework5.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * The type Vet controller.
 */
@Controller
public class VetController {

    /**
     * List vets string.
     *
     * @return the string
     */
    @RequestMapping({"/vets"})
    public String listVets() {
        return "vets/vet";
    }
}
