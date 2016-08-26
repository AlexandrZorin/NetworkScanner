package ru.technex.networkscanner.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.technex.networkscanner.model.Scanner;

@Controller
public class AppController {
    @Autowired
    Scanner scanner;

    @RequestMapping("/")
    public String scanner(Model model) {
        model.addAttribute("scanner", scanner.getScanner());
        return "scanner";
    }
}
