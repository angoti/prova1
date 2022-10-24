package com.professorangoti.prova1.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.professorangoti.prova1.model.Product;

@Controller
public class ProvaController {

    @GetMapping
    public String home() {
        return "home";
    }

    @GetMapping("questao01")
    public String questao01() {
        return "questao-01";
    }

    @GetMapping("questao02")
    public String questao02(Model model) {
        List<Product> lista = new ArrayList<Product>();
        lista.add(new Product("Bicicleta",1000,LocalDate.now())); 
        lista.add(new Product("Computador",2000,LocalDate.now())); 
        lista.add(new Product("Cadeira",300,LocalDate.now())); 
        lista.add(new Product("Mesa", 400, LocalDate.now()));
        model.addAttribute("listadeprodutos", lista);
        return "questao-02";
    }

    @GetMapping("questao03")
    public String questao03() {
        return "questao-03";
    }

}
