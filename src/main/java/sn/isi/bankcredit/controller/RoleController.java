package sn.isi.bankcredit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/roles")
public class RoleController {


    // Redirection des pages client
    @GetMapping("/list")
    public String list() {
        return "roles/list";
    }

    @GetMapping("/add")
    public String add() {
        return "roles/add";
    }

    @GetMapping("/update")
    public String update() {return "roles/update";}

    @GetMapping("/delete")
    public String delete(){return "roles/delete";}

    // Redirection des pages client

}
