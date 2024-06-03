package com.oussama.ninja_gold_game.controllers;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

@Controller
public class MainController {

    @GetMapping("/")
    public String home(HttpSession session) {
        // Initialize session attributes if not present
        if (session.getAttribute("gold") == null) {
            session.setAttribute("gold", 0);
            session.setAttribute("activities", new ArrayList<Activity>());
        }
        return "index";
    }

    @PostMapping("/process")
    public String process(
            HttpSession session,
            @RequestParam(value = "action") String action
    ) {
        Random random = new Random();
        int gold = (int) session.getAttribute("gold");
        ArrayList<Activity> activities = (ArrayList<Activity>) session.getAttribute("activities");
        String activityMessage = "";
        int goldEarned = 0;
        boolean earned = true;

        // Determine gold earned or lost based on action
        switch (action) {
            case "farm":
                goldEarned = random.nextInt(11) + 10; // Random gold between 10 and 20
                activityMessage = "You entered a farm and earned " + goldEarned + " gold.";
                break;
            case "cave":
                goldEarned = random.nextInt(6) + 5; // Random gold between 5 and 10
                activityMessage = "You entered a cave and earned " + goldEarned + " gold.";
                break;
            case "house":
                goldEarned = random.nextInt(4) + 2; // Random gold between 2 and 5
                activityMessage = "You entered a house and earned " + goldEarned + " gold.";
                break;
            case "quest":
                goldEarned = random.nextInt(101) - 50; // Random gold between -50 and 50
                if (goldEarned >= 0) {
                    activityMessage = "You entered a quest and earned " + goldEarned + " gold.";
                } else {
                    activityMessage = "You failed a quest and lost " + Math.abs(goldEarned) + " gold. Ouch.";
                    earned = false;
                }
                break;
            case "spa":
                goldEarned = -(random.nextInt(16) + 5); // Random gold lost between 5 and 20
                activityMessage = "Spa: Lost " + Math.abs(goldEarned) + " gold";
                earned = false;
                break;
            case "reset":
                gold = 0;
                activities.clear();
                session.setAttribute("gold", gold);
                session.setAttribute("activities", activities);
                return "redirect:/";
        }

        gold += goldEarned;
        String timestamp = new SimpleDateFormat("MMMM d'st', yyyy h:mma").format(new Date());
        activities.add(new Activity(activityMessage + " (" + timestamp + ")", earned));

        session.setAttribute("gold", gold);
        session.setAttribute("activities", activities);

        // Redirect to debtor's prison if gold is too low
        if (gold < -100) {
            return "redirect:/debtors-prison";
        }

        return "redirect:/";
    }

    @GetMapping("/debtors-prison")
    public String debtorsPrison() {
        return "debtors-prison";
    }

    public static class Activity {
        private final String message;
        private final boolean earned;

        public Activity(String message, boolean earned) {
            this.message = message;
            this.earned = earned;
        }

        public String getMessage() {
            return message;
        }

        public boolean isEarned() {
            return earned;
        }
    }
}
