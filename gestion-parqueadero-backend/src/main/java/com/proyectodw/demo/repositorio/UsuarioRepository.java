package com.proyectodw.demo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyectodw.demo.entidad.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

    public Usuario findByUsername(String username);
    
}
