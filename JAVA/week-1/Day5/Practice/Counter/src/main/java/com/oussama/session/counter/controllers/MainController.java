package com.oussama.session.counter.controllers;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @RequestMapping("/")
    public String index(HttpSession session ) {
        Integer count;

        if (session.getAttribute("count") == null) {
            session.setAttribute("count", 0);
        }else{
            count = (Integer) session.getAttribute("count");
            count++;
            session.setAttribute("count", count);
        }
        return "index";
    }
    @RequestMapping("/counter")
    public String counter() {
        return "counter";
    }
}
