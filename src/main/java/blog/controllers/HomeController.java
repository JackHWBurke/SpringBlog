package blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


// defines a spring web mvc controller
// and defines an action that handles HTTP GET requests
@Controller

public class HomeController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }
}
