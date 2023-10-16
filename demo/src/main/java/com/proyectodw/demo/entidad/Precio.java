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

    @Column(name= "tipo_v", nullable=false, length=10, unique =true )
    private String tipo_v;

    @Column(name= "tam_tipo_v", nullable=false, length=10, unique =false)
    private float tam_tipo_v;

    @Column(name= "precio", nullable=false, length=10, unique =false)
    private float precio;

    public Precio(){

    }

    
    public Precio(Long id, String tipo_v, float precio, float tam_tipo_v) {
        this.id = id;
        this.tipo_v = tipo_v;
        this.precio = precio;
        this.tam_tipo_v = tam_tipo_v;
    }
    public Precio( String tipo_v, float precio, float tam_tipo_v) {
        this.tipo_v = tipo_v;
        this.precio = precio;
        this.tam_tipo_v = tam_tipo_v;
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
    public void setTam_tipo_v(float tam_tipo_v){
        this.tam_tipo_v = tam_tipo_v;
    }
    public float getTam_tipo_v() {
        return tam_tipo_v;
    }
    
    @Override
    public String toString() {
        return "Precio [id=" + id + ", tipo_v=" + tipo_v + ", tam_tipo_v=" + tam_tipo_v + ", precio=" + precio + "]";
    }
    

    
}
