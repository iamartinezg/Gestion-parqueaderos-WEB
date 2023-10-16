package com.proyectodw.demo.entidad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "pisos")
public class Piso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name= "numero",nullable=false, length = 3, unique = true)
    private int numero;

    @Column(name= "tipo_v",nullable=false, length = 10)
    private String tipo_v;

    @Column(name= "cupos_v",nullable=false, length = 5)
    public float cupos_v;

    public Piso(){

    }

    public Piso(Long id, int numero, String tipo_v, float cupos_v) {
        this.id = id;
        this.numero = numero;
        this.tipo_v = tipo_v;
        this.cupos_v = cupos_v;
    }
    public Piso( int numero, String tipo_v, float cupos_v) {
        this.numero = numero;
        this.tipo_v = tipo_v;
        this.cupos_v = cupos_v;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo_v() {
        return tipo_v;
    }

    public void setTipo_v(String tipo_v) {
        this.tipo_v = tipo_v;
    }

    public float getCupos_v() {
        return cupos_v;
    }

    public void setCupos_v(float cupos_v) {
        this.cupos_v = cupos_v;  
    }

    @Override
    public String toString() {
        return "Piso [id=" + id + ", numero=" + numero + ", tipo_v=" + tipo_v + ", cupos_v=" + cupos_v + "]";
    }
    
}
