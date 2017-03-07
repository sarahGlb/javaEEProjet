package friendofmine.controller;

import friendofmine.Bootstrap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Sarah on 27/02/2017.
 */

@Controller
public class UtilisateurController {

    @Autowired
    private Bootstrap bootstrap;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("utilisateurs",bootstrap.getUser());
        return "utilisateurs";
    }
}
