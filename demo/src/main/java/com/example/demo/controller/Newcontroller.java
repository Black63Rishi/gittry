package com.example.demo.controller;

import com.example.demo.model.Employee;
import com.example.demo.repositories.Employeerepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class Newcontroller {
    @Autowired
    public Employeerepositories employeerepositories;
    @GetMapping("/index")
    public String execute(Model model){
        model.addAttribute("employee", new Employee());
        return "index";
    }
    @PostMapping("/save")
    public String tosave(@ModelAttribute("employee")Employee student){
        employeerepositories.save(student);
        return "redirect:/index";
    }
    @GetMapping("/list")
    public String tolist(Model model){
        model.addAttribute("employee",employeerepositories.findAll());
        return "viewstudents";
    }
}
