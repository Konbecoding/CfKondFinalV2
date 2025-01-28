package gr.aueb.cf.CfKondFinalV2;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AuthController {

    private final UserService userService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/login")
    public String loginPage(@RequestParam(value = "error", required = false) String error, Model model) {
        if (error != null) {
            model.addAttribute("errorMessage", "Invalid username or password.");
        }
        return "login";
    }

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute("user") @Valid User user, Model model) {
        try {
            if (userService.userExists(user.getUsername())) {
                model.addAttribute("errorMessage", "Username already taken.");
                return "register";
            }
            userService.registerUser(user);
            model.addAttribute("successMessage", "Registration successful! You can now log in.");
            return "login";
        } catch (Exception e) {
            model.addAttribute("errorMessage", "An error occurred during registration. Please try again.");
            return "register";
        }
    }

}

