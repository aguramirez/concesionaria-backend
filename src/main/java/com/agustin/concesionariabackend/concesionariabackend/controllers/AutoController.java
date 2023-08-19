package com.agustin.concesionariabackend.concesionariabackend.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agustin.concesionariabackend.concesionariabackend.models.entities.Auto;
import com.agustin.concesionariabackend.concesionariabackend.services.AutoService;

@RestController
@RequestMapping("/autos")
@CrossOrigin(origins = "*")
public class AutoController {
    
    @Autowired
    private AutoService service;

    @GetMapping
    public List<Auto> index(){
        return service.findAll();
    }

    @GetMapping("/detalle/{id}")
    public ResponseEntity<?> show(@PathVariable Long id){
        Optional<Auto> autoOpt = service.findById(id);

        if(autoOpt.isPresent()){
            return ResponseEntity.ok(autoOpt.orElseThrow());
        }
        return ResponseEntity.notFound().build();

    }

    @PostMapping("/crear")
    public ResponseEntity<?> save(@RequestBody Auto auto){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(auto));
    }

    @PutMapping("editar/{id}")
    public ResponseEntity<?> update(@RequestBody Auto auto, @PathVariable Long id){
        Optional<Auto> a = service.update(auto, id);
        if(a.isPresent()){
            return ResponseEntity.status(HttpStatus.CREATED).body(a.orElseThrow());
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> remove(@PathVariable Long id){
        Optional<Auto> a = service.findById(id);
        if(a.isPresent()){
            service.remove(id);
            return ResponseEntity.noContent().build(); //204
        }
        return ResponseEntity.notFound().build(); //404
    }
}
