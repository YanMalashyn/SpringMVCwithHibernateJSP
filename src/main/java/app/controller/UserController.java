package app.controller;

import app.model.User;
//import jakarta.validation.Valid;
import app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String index(Model model){
        List<User> userList = userService.getListUsers();
        model.addAttribute("userList", userList);
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
            userService.saveUser(user);
            return "showUser";
        }
    }

    @GetMapping("/{id}")
    public String getUser(@PathVariable("id") int id, Model model) {
        model.addAttribute("newUser", userService.getUserById(id));
        return "showUser";
    }

    @GetMapping("/{id}/delete")
    public String deleteUser(@PathVariable("id") int id) {
        userService.deleteUser(id);
        return "redirect:/";
    }

    @GetMapping("/{id}/edit")
    public String editUser(@PathVariable("id") int id, Model model) {
        model.addAttribute("newUser", userService.getUserById(id));
        return "editUser";
    }


    @RequestMapping("/{id}/editUserOk")
    public String editUserOk(@ModelAttribute("newUser") @Valid User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "/"+user.getId()+"/edit";
        } else {
            System.out.println("ok");
            userService.updateUser(user);
            System.out.println("ok");
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

