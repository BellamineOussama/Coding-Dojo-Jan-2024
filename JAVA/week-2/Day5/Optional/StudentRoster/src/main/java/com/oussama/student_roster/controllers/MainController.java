package com.oussama.student_roster.controllers;

import com.oussama.student_roster.models.Dorm;
import com.oussama.student_roster.models.Student;
import com.oussama.student_roster.services.DormService;
import com.oussama.student_roster.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {
    @Autowired
    private DormService dormService;

    @Autowired
    private StudentService studentService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("dorms", dormService.allDorms());
        return "dorms";
    }

    @GetMapping("/dorms/new")
    public String newDorm(@ModelAttribute("dorm") Dorm dorm) {
        return "newDorm";
    }

    @PostMapping("/dorms/new")
    public String addDorm(@ModelAttribute("dorm") Dorm dorm) {
        dormService.addDorm(dorm);
        return "redirect:/";
    }

    @GetMapping("/students/new")
    public String newStudent(@ModelAttribute("student") Student student, Model model) {
        model.addAttribute("dorms", dormService.allDorms());
        return "newStudent";
    }

    @PostMapping("/students/new")
    public String addStudent(@ModelAttribute("student") Student student) {
        studentService.addStudent(student);
        return "redirect:/";
    }

    @GetMapping("/dorms/{id}")
    public String viewDorms(@PathVariable("id") Long id, Model model) {
        model.addAttribute("dorm", dormService.findDorm(id));
        model.addAttribute("students", studentService.dormStudents(id));
        return "viewDorm";
    }

    @GetMapping("/students/remove/{id}")
    public String removeStudent(@PathVariable("id") Long id) {
        studentService.removeFromDorm(studentService.findStudent(id));
        return "redirect:/";
    }
}