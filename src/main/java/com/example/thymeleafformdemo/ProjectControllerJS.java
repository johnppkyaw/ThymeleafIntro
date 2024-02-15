package com.example.thymeleafformdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProjectControllerJS {
    //moved from SimpleController.java
    @GetMapping("/getProjectsJS")
    public String getProjectsJS(){
        System.out.println("Getting resultJS page!!");
        return("resultJS");
    }
    //moved from SimpleController.java
    @GetMapping("/createProjectJS")
    public String addProjectJS(){
        System.out.println("Show create-product Form!!");
        return("create-projectJS");
    }
}