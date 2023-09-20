package com.proyectodw.demo.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyectodw.demo.entidad.Piso;
import com.proyectodw.demo.repositorio.PisoRepositorio;

@Service
public class PisoServicioImpl implements PisoServicio{
    @Autowired
    private PisoRepositorio repositorio;

    @Override
    public List<Piso> listarTodosLosPisos() {
        return repositorio.findAll();
    }

    @Override
    public Piso guardarPiso(Piso piso) {
        return repositorio.save(piso);
    }

    @Override
    public Piso obtenerPisoPorId(Long id) {
        return repositorio.findById(id).get();
    }

    @Override
    public Piso actualizarPiso(Piso piso) {
        return repositorio.save(piso);
    }

    @Override
    public void eliminarPiso(Long id) {
        repositorio.deleteById(id);
    }

    
    
}
