package com.agustin.concesionariabackend.concesionariabackend.services;

import java.util.List;
import java.util.Optional;

import com.agustin.concesionariabackend.concesionariabackend.models.entities.Auto;

public interface AutoService {
    
    public List<Auto> findAll();

    public Optional<Auto> findById(Long id);

    public Auto save(Auto auto);
}
