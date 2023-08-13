package com.agustin.concesionariabackend.concesionariabackend.models.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "autos")
public class Auto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String marca;
    private String modelo;
    private Integer anio;
    private Integer km;
    private Double precio;
    private List<String> imagenesUrl;
    private String descripcion;
    private String tipo;
    private String version;
    private String color;
    private String combustible;
    private Integer puertas;
    private String transmicion;
    private String motor;

    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public Integer getAnio() {
        return anio;
    }
    public void setAnio(Integer anio) {
        this.anio = anio;
    }
    public Integer getKm() {
        return km;
    }
    public void setKm(Integer km) {
        this.km = km;
    }
    public Double getPrecio() {
        return precio;
    }
    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    public List<String> getImagenesUrl() {
        return imagenesUrl;
    }
    public void setImagenesUrl(List<String> imagenesUrl) {
        this.imagenesUrl = imagenesUrl;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getVersion() {
        return version;
    }
    public void setVersion(String version) {
        this.version = version;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getCombustible() {
        return combustible;
    }
    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }
    public Integer getPuertas() {
        return puertas;
    }
    public void setPuertas(Integer puertas) {
        this.puertas = puertas;
    }
    public String getTransmicion() {
        return transmicion;
    }
    public void setTransmicion(String transmicion) {
        this.transmicion = transmicion;
    }
    public String getMotor() {
        return motor;
    }
    public void setMotor(String motor) {
        this.motor = motor;
    }


}
