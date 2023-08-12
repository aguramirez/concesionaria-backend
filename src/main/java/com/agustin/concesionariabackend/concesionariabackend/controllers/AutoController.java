package com.agustin.concesionariabackend.concesionariabackend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agustin.concesionariabackend.concesionariabackend.models.entities.Auto;
import com.agustin.concesionariabackend.concesionariabackend.services.AutoService;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class AutoController {
    
    @Autowired
    private AutoService service;

    @GetMapping("/")
    public List<Auto> index(){
        return service.findAll();
    }
}
