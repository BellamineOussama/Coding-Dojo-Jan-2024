package com.oussama.firstapp.displaydate.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class MainController {
    @RequestMapping("/")
    public String home () {
        return "home";
    }
    @RequestMapping("/date")
    public String date(Model model) {
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE, MMM d, yyyy");
        Date date = new Date();
        model.addAttribute("date", sdf.format(date));
        return "date";
    }
    @RequestMapping("/time")
    public String time(Model model) {
        SimpleDateFormat sdf = new SimpleDateFormat("h:mm a");
        Date date = new Date();
        model.addAttribute("time", sdf.format(date));
        return "time";
    }
}
