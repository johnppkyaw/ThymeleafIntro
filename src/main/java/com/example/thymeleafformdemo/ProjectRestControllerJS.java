package com.example.thymeleafformdemo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class ProjectRestControllerJS {
    private final List<Project> projects = new ArrayList<>(); // Shared ArrayList

    @GetMapping("/projects")
    public List<Project> getProjects() {
        return projects;
    }

    //Handles POST request from create-product.html; saves the product to products list
    @PostMapping("/create-project")
    public ResponseEntity<Void> createProject(@RequestBody Project project) {
        projects.add(project);
        for (int i = 0; i < projects.size(); i++) {
            Project proj = projects.get(i);
            System.out.println("Project ID: " + proj.getId());
            System.out.println("Title: " + proj.getTitle());
            System.out.println("--------------------"); // Optional separator
        }
        return ResponseEntity.ok().build();
    }
}