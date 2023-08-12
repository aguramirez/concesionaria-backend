package com.agustin.concesionariabackend.concesionariabackend.services;

import java.util.List;

import com.agustin.concesionariabackend.concesionariabackend.models.entities.Auto;

public interface AutoService {
    
    public List<Auto> findAll();
}
