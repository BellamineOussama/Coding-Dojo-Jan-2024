package com.oussama.hellohuman.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HumanController {
    @RequestMapping("/")
    public String home(
            @RequestParam(value="name", required = false) String name,
            @RequestParam(value="last_name",required = false) String lastName,
            @RequestParam(value = "times", required = false, defaultValue = "1") int times ) {
        if (name == null) {
            name = "Human";
        }
        if (lastName == null) {
            lastName = " ";
        }else {
            lastName = " " + lastName;
        }

        String greet = "Hello " + name + lastName;
        StringBuilder repeatgreet = new StringBuilder();
        for (int i = 0; i < times; i++) {
            repeatgreet.append(greet);
        }
        return repeatgreet.toString();
    }
}
