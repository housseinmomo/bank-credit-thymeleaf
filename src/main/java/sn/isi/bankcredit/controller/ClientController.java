package sn.isi.bankcredit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/clients")
public class ClientController {

    // Redirection des pages client
    @GetMapping("/list")
    public String list() {
        return "clients/list";
    }

    @GetMapping("/add")
    public String add() {
        return "clients/add";
    }

    @GetMapping("/update")
    public String update() {return "clients/update";}

    @GetMapping("/delete")
    public String delete(){return "clients/delete";}

    // Redirection des pages client

    // Traitement avec la base de donnees

    public void listClient(){}

    public void addClient(){}

    public void deleteClient(){}

    public void updateClient(){}

    // Traitement avec la base de donnees
}
