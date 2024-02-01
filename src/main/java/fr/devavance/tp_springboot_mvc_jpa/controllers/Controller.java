package fr.devavance.tp_springboot_mvc_jpa.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {
    @RequestMapping("/")
    public String getTemplate1(Model model){
        model.addAttribute("name", "Capteur température");
        return "template1";
    }
}
