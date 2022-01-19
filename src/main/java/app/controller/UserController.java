package app.controller;

import app.model.User;
//import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class UserController {

    @RequestMapping("/")
    public String hello(){
        return "index";
    }

    @RequestMapping("/newUser")
    public String newUser(Model model){
        model.addAttribute("newUser", new User());
        return "newUser";
    }

    @RequestMapping("/showUser")
    public String showUser(@ModelAttribute("newUser") @Valid User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "newUser";
        } else {
            return "showUser";
        }
    }

    @RequestMapping("/testUser")
    public String testUser(Model model){
        User user = new User();
        user.setName("Yan");
        user.setSurname("Malashyn");
        model.addAttribute("user", user);
        return "testUser";
    }
}

