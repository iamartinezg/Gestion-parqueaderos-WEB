package com.proyectodw.demo.servicio;

import java.util.List;
import com.proyectodw.demo.entidad.Precio;

public interface PrecioServicio {

    public List <Precio> listarTodosLosPrecios();

    public Precio guardarPrecio(Precio precio);

    public Precio obtenerPrecioPorId(Long id);

    public Precio actualizarPrecio(Precio precio);

    public void eliminarPrecio(Long id);

    

    
}
