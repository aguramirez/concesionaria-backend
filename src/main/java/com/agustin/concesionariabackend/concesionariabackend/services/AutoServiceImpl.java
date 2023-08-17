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

    @Override
    @Transactional
    public Optional<Auto> update(Auto auto, Long id) {
        Optional<Auto> a = this.findById(id);
        Auto autoOpt = null;

        if(a.isPresent()){
            Auto autoDb = a.orElseThrow();
            autoDb.setMarca(auto.getMarca());
            autoDb.setModelo(auto.getModelo());
            autoDb.setAnio(auto.getAnio());
            autoDb.setKm(auto.getKm());
            autoDb.setPrecio(auto.getPrecio());
            autoDb.setImagenesUrl(auto.getImagenesUrl());
            autoDb.setDescripcion(auto.getDescripcion());
            autoDb.setTipo(auto.getTipo());
            autoDb.setVersion(auto.getVersion());
            autoDb.setColor(auto.getColor());
            autoDb.setCombustible(auto.getCombustible());
            autoDb.setPuertas(auto.getPuertas());
            autoDb.setTransmicion(auto.getTransmicion());
            autoDb.setMotor(auto.getMotor());
            autoOpt = this.save(autoDb);
        }
        return Optional.ofNullable(autoOpt);
    }
    
    @Override
    @Transactional
    public void remove(Long id) {
        repository.deleteById(id);
    }
    
}
