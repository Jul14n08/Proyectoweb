package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Ciudad {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    
    private String ciudad;
    private Float impuestos;
    
    public Ciudad() {}

    public Ciudad(String ciudad, Float impuestos) {
        this.ciudad = ciudad;
        this.impuestos = impuestos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Float getImpuestos() {
        return impuestos;
    }

    public void setImpuestos(Float impuestos) {
        this.impuestos = impuestos;
    }

    

    

}
