package gr.aueb.cf.CfKondFinalV2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/")
    public String home() {
        return "index";  // Loads index.html from templates
    }

    @GetMapping("/about")
    public String aboutPage() {
        return "about";  // Loads about.html from templates
    }

    @GetMapping("/user/register")
    public String registerPage() {
        return "register";
    }

    @GetMapping("/user/login")
    public String loginPage() {
        return "login";
    }

    @GetMapping("/tetris")
    public String tetrisPage() {
        return "tetris";  // Requires authentication, loads tetris.html
    }

}