package com.agustin.concesionariabackend.concesionariabackend.repositories;

import org.springframework.data.repository.CrudRepository;

import com.agustin.concesionariabackend.concesionariabackend.models.entities.Auto;

public interface AutoRepository extends CrudRepository<Auto, Long>{
    
}
