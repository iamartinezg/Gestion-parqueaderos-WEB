package com.proyectodw.demo.servicio;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyectodw.demo.entidad.Precio;
import com.proyectodw.demo.repositorio.PrecioRepositorio;

@Service
public class PrecioServicioImpl implements PrecioServicio{
    @Autowired
    private PrecioRepositorio repositorio;

    @Override
    public List<Precio> listarTodosLosPrecios(){
        return repositorio.findAll();
    }
    @Override
    public Precio obtenerPrecioPorId(Long id){
        return repositorio.findById(id).get();
    }
    @Override
    public Precio guardarPrecio(Precio precio){
        return repositorio.save(precio);
    }
    @Override
    public Precio actualizarPrecio(Precio precio){
        return repositorio.save(precio);
    }
    @Override
    public void eliminarPrecio(Long id){
        repositorio.deleteById(id);
    }
    
   
   
}