package com.proyectodw.demo.repositorio;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyectodw.demo.entidad.Piso;

@Repository
public interface PisoRepositorio extends JpaRepository<Piso, Long>{

    
    
}
