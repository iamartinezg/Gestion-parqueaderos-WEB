package com.proyectodw.demo.servicio;

import java.util.List;

import com.proyectodw.demo.entidad.Piso;

public interface PisoServicio {

    public List <Piso> listarTodosLosPisos();

    public Piso guardarPiso(Piso piso);

    public Piso obtenerPisoPorId(Long id);

    public Piso actualizarPiso(Piso piso);

    public void eliminarPiso(Long id);
    
}
