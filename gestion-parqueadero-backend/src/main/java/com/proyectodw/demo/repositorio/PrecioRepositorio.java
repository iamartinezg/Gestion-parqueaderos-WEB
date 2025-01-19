package com.proyectodw.demo.repositorio;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyectodw.demo.entidad.Precio;

@Repository
public interface PrecioRepositorio extends JpaRepository<Precio, Long>{


    
}
