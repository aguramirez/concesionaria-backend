package com.agustin.concesionariabackend.concesionariabackend.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.agustin.concesionariabackend.concesionariabackend.models.entities.Auto;
import com.agustin.concesionariabackend.concesionariabackend.repositories.AutoRepository;

@Service
public class AutoServiceImpl implements AutoService {

    @Autowired
    private AutoRepository repository;

    @Override
    @Transactional(readOnly = true)
    public List<Auto> findAll() {
        return (List<Auto>) repository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Auto> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    @Transactional
    public Auto save(Auto auto) {
        return repository.save(auto);
    }
    
    
}
