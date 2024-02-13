package com.example.thymeleafformdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SignUpController {

    @GetMapping("/sign-up") //Get sign-up page
    public String signupForm(Model model) {

        model.addAttribute("mysignup", new SignUpPOJO());
        return "sign-up"; //returns sign-up html page
    }

    @PostMapping("/save-signup")
    public String saveSignUpSubmission(Model model, SignUpPOJO mysignup) {
        System.out.println(">>>>>> IN saveLoginSubmission");
        System.out.println(">>>>>> uname="+mysignup.getUname());
        System.out.println(">>>>>> pass ="+mysignup.getPassword());
        System.out.println(">>>>>> email ="+mysignup.getEmailAddress());
        // TODO:
        model.addAttribute("mysignup", mysignup);
        return "signup-result";
    }

}