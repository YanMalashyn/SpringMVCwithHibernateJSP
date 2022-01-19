package app.controller;

import app.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

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
    public String showUser( @ModelAttribute("newUser") User user){

                return "showUser";
            }

}

