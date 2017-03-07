package friendofmine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Sarah on 27/02/2017.
 */

@Controller
public class IndexController {

    @RequestMapping("/")
    String  index (){
        return "index";
    }
}
