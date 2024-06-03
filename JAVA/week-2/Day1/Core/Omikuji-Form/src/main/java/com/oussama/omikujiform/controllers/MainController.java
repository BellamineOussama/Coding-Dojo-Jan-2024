package com.oussama.omikujiform.controllers;


import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    @RequestMapping("/omikuji")
    public String home(){
        return "index";
    }

    @PostMapping("/send")
    public String send(
            @RequestParam("number") int number,
            @RequestParam("city") String city,
            @RequestParam("person") String person,
            @RequestParam("profession") String profession,
            @RequestParam("living") String living,
            @RequestParam("nice") String nice,
            HttpSession session ){

            session.setAttribute("number", number);
            session.setAttribute("city", city);
            session.setAttribute("person", person);
            session.setAttribute("profession", profession);
            session.setAttribute("living", living);
            session.setAttribute("nice", nice);

            return "redirect:/result";
    }

    @GetMapping("/result")
    public String result() {
        return "result";
    }
}



