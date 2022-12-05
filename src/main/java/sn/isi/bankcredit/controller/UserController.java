package sn.isi.bankcredit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserController {

    // Redirection des pages client
    @GetMapping("/list")
    public String list() {
        return "users/list";
    }

    @GetMapping("/add")
    public String add() {
        return "users/add";
    }

    @GetMapping("/update")
    public String update() {return "users/update";}

    @GetMapping("/delete")
    public String delete(){return "users/delete";}

    // Redirection des pages client
}
