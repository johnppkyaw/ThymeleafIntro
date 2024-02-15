package com.example.thymeleafformdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProductController {
    //moved from SimpleController.java
    @GetMapping("/getproducts")
    public String showForm2(){
        System.out.println("Show the Form!!");
        return("getprodBS");
    }
    //moved from SimpleController.java
    @GetMapping("/addproducts")
    public String showForm3(){
        System.out.println("Show create-product Form!!");
        return("create-product");
    }
}


