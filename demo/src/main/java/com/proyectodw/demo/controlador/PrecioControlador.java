package com.proyectodw.demo.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.proyectodw.demo.entidad.Precio;
import com.proyectodw.demo.servicio.PrecioServicio;




@Controller
public class PrecioControlador {

    @Autowired
    private PrecioServicio servicio;

    @GetMapping("/precios")
    public String mostrarPrecios(Model modelo) {
        modelo.addAttribute("precios", servicio.listarTodosLosPrecios());
        return "precios"; 
    }
    @GetMapping("/precios/nuevo")
    public String crearPrecioFormulario(Model modelo){
        Precio precio = new Precio();
        
        modelo.addAttribute("precio", precio);
        return "crear_precio";
    }
    @PostMapping("/precios")
    public String guardarPrecio(@ModelAttribute("precio")Precio precio){
        servicio.guardarPrecio(precio);
        return "redirect:/precios";
    }
    @GetMapping("/precios/editar/{id}")
    public String mostrarFormularioEditar(@PathVariable Long id, Model modelo){
        modelo.addAttribute("precio", servicio.obtenerPrecioPorId(id));
        return "editar_precio";
    }
    @PostMapping("/precios/{id}")
    public String actualizarPrecios(@PathVariable Long id,@ModelAttribute("precio") Precio precio,Model modelo){
        Precio precioExistente = servicio.obtenerPrecioPorId(id);
        precioExistente.setId(id);
        precioExistente.setPrecio(precio.getPrecio());
        precioExistente.setTipo_v(precio.getTipo_v());

        servicio.actualizarPrecio(precioExistente);
        return "redirect:/precios";
    }
    @GetMapping("/precios/{id}")
    public String eliminarPrecio(@PathVariable Long id){
        return "redirect:/precios";
    }
    
}
