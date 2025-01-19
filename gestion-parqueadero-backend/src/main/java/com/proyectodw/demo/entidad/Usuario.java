package com.proyectodw.demo.entidad;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.HashSet;
import jakarta.persistence.FetchType;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String password;

    private String nombre;

    private String apellido;

    private String telefono;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Set<UsuarioRol> getUsusarioRoles() {
        return ususarioRoles;
    }

    public void setUsusarioRoles(Set<UsuarioRol> ususarioRoles) {
        this.ususarioRoles = ususarioRoles;
    }

    public Usuario(){

    }

    
    public Usuario(String username, String password, String nombre, String apellido, String telefono,
            Set<UsuarioRol> ususarioRoles) {
        this.username = username;
        this.password = password;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.ususarioRoles = ususarioRoles;
    }


    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "usuario")
    @JsonIgnore
    private Set<UsuarioRol> ususarioRoles = new HashSet<>();

}
