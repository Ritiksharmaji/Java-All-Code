package com.springBoot.serverside.validation.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springBoot.serverside.validation.entities.LoginData;

@Controller
@RequestMapping("api/formvalidation")
public class MyController {

    @GetMapping("/form")
    public String openForm(Model model) {
        System.out.println("openform handler executed");
        model.addAttribute("loginData", new LoginData());
        return "form";
    }

    @PostMapping("/submit")
    public String processForm(
            @Valid @ModelAttribute("loginData") LoginData loginData,
            BindingResult result,
            Model model) {

        System.out.println("Received data: " + loginData);

        if (result.hasErrors()) {
            System.out.println("Validation errors occurred:");
            System.out.println(result.getAllErrors());
            return "form";
        }

        model.addAttribute("loginData", loginData);
        return "success";
    }

}
