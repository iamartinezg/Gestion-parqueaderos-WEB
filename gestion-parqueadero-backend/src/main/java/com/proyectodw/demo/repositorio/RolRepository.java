package com.proyectodw.demo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyectodw.demo.entidad.Rol;

public interface RolRepository extends JpaRepository<Rol,Long>{
    
}
