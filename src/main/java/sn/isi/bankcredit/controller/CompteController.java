package sn.isi.bankcredit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/comptes")
public class CompteController {

    // Redirection des pages client
    @GetMapping("/list")
    public String list() {
        return "comptes/list";
    }

    @GetMapping("/add")
    public String add() {
        return "comptes/add";
    }

    @GetMapping("/update")
    public String update() {return "comptes/update";}

    @GetMapping("/delete")
    public String delete(){return "comptes/delete";}

    // Redirection des pages client

}
