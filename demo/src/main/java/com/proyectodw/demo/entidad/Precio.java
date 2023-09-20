package com.proyectodw.demo.entidad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="precios")
public class Precio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name= "tipo_v", nullable=false, length=10, unique =false )
    private String tipo_v;

    @Column(name= "precio", nullable=false, length=10, unique =false)
    private float precio;

    public Precio(){

    }

    public Precio(Long id, String tipo_v, float precio) {
        this.id = id;
        this.tipo_v = tipo_v;
        this.precio = precio;
    }
    public Precio( String tipo_v, float precio) {
        this.tipo_v = tipo_v;
        this.precio = precio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo_v() {
        return tipo_v;
    }

    public void setTipo_v(String tipo_v) {
        this.tipo_v = tipo_v;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Precio [id=" + id + ", tipo_v=" + tipo_v + ", precio=" + precio + "]";
    }
    

    

    
    
}
