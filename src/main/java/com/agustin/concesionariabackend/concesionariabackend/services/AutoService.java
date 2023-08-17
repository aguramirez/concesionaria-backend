package com.agustin.concesionariabackend.concesionariabackend.services;

import java.util.List;
import java.util.Optional;

import com.agustin.concesionariabackend.concesionariabackend.models.entities.Auto;

public interface AutoService {
    
    List<Auto> findAll();

    Optional<Auto> findById(Long id);

    Auto save(Auto auto);

    Optional<Auto> update(Auto auto, Long id);

    void remove(Long id);
}
