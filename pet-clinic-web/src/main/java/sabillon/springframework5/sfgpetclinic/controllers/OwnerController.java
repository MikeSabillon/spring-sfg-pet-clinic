package sabillon.springframework5.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * The type Owner controller.
 */
@Controller
public class OwnerController {

    /**
     * List owners string.
     *
     * @return the string
     */
    @RequestMapping("/owners")
    public String listOwners() {
        return "owner/owner";
    }

}
