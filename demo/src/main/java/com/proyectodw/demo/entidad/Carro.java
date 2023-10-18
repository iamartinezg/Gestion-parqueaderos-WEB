package com.proyectodw.demo.entidad;

import java.sql.Date;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "carros")
public class Carro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;    

    @Column(name= "placa",nullable=false, length = 10, unique = true)
    private String placa;

    @Column(name= "tipo_v",nullable=false, length = 10)
    private String tipo_v;  

    @Column(name = "num_piso",nullable = false, length = 3)
    private int num_piso;

    @Column(name = "h_ingreso",nullable = false, length = 10)
    private Date h_ingreso;

    @Column(name = "h_salida",nullable = false, length = 10)
    private Date h_salida;

    @Column(name = "valor_a_pagar",nullable = false, length = 10)
    private float valor_a_pagar;

    public Carro(){

    }

    public Carro(Long id, String placa, String tipo_v, int num_piso, Date h_ingreso, Date h_salida, float valor_a_pagar) {
        this.id = id;
        this.placa = placa;
        this.tipo_v = tipo_v;
        this.num_piso = num_piso;
        this.h_ingreso = h_ingreso;
        this.h_salida = h_salida;
        this.valor_a_pagar = valor_a_pagar;
    }

    public Carro(String placa, String tipo_v, int num_piso, Date h_ingreso, Date h_salida, float valor_a_pagar) {
        this.placa = placa;
        this.tipo_v = tipo_v;
        this.num_piso = num_piso;
        this.h_ingreso = h_ingreso;
        this.h_salida = h_salida;
        this.valor_a_pagar = valor_a_pagar;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipo_v() {
        return tipo_v;
    }

    public void setTipo_v(String tipo_v) {
        this.tipo_v = tipo_v;
    }

    public int getNum_piso() {
        return num_piso;
    }

    public void setNum_piso(int num_piso) {
        this.num_piso = num_piso;
    }

    public Date getH_ingreso() {
        return h_ingreso;
    }

    public void setH_ingreso(Date h_ingreso) {
        this.h_ingreso = h_ingreso;
    }

    public Date getH_salida() {
        return h_salida;
    }

    public void setH_salida(Date h_salida) {
        this.h_salida = h_salida;
    }

    public float getValor_a_pagar() {
        return valor_a_pagar;
    }

    public void setValor_a_pagar(float valor_a_pagar) {
        this.valor_a_pagar = valor_a_pagar;
    }

    @Override
    public String toString() {
        return "Carro [id=" + id + ", placa=" + placa + ", tipo_v=" + tipo_v + ", num_piso=" + num_piso + ", h_ingreso="
                + h_ingreso + ", h_salida=" + h_salida + ", valor_a_pagar=" + valor_a_pagar +"]";
    }
    
    
}
