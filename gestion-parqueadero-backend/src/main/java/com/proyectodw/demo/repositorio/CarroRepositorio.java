package com.proyectodw.demo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyectodw.demo.entidad.Carro;

@Repository
public interface CarroRepositorio extends JpaRepository<Carro, Long> {
    
}
