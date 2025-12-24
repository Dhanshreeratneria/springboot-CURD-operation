package com.example.amazon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller

public class AmaController {
    @Autowired
    private AmazonSer As;

    @GetMapping("/")
    public String Home(Model m) {
        for (Amazon az : As.view())
            System.out.println(az);
        m.addAttribute("obj", As.view());
        return "Index";
    }

    @GetMapping("/reg")
    public String Registration(Model model) {
        // Employee employee = new Employee();
        // model.addAttribute("employee", employee);
        model.addAttribute("Amazon", new Amazon());
        return "Signup";

    }

    @PostMapping("/save")
    public String saveEmployee(@ModelAttribute("Amazon") Amazon Ama1) {
        System.out.println("called.......");
        System.out.println(Ama1);
        As.save(Ama1);
        return "redirect:/";

    }

      @GetMapping("/showFormForUpdate/{id}")
    public String updateForm(@PathVariable(value = "id") int id, Model model) {
        Amazon employee = As.getById(id);
        model.addAttribute("employee", employee);
        return "update";
    }
 
    
    @GetMapping("/deleteEmployee/{id}")
    public String deleteThroughId(@PathVariable(value = "id") int id) {
        As.deleteViaId(id);
        return "redirect:/";
 
    }

}
