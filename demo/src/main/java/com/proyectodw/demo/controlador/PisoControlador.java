package com.proyectodw.demo.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.proyectodw.demo.entidad.Piso;
import com.proyectodw.demo.entidad.Precio;
import com.proyectodw.demo.repositorio.PrecioRepositorio;
import com.proyectodw.demo.servicio.PisoServicio;



@Controller
public class PisoControlador {

    @Autowired
    private PisoServicio servicio;
    @Autowired
    private PrecioRepositorio precioRepository;
    
    

    @GetMapping({"/pisos","/"})
    public String listarPisos(Model modelo){
        modelo.addAttribute("pisos", servicio.listarTodosLosPisos());
        return "pisos"; //retorna al archivo pisos
    }

    @GetMapping("/pisos/nuevo")
    public String crearPisoFormulario(Model modelo){
        Piso piso = new Piso();
        modelo.addAttribute("piso", piso);
        List<Precio> precios = precioRepository.findAll();
        modelo.addAttribute("precios", precios);
        return "crear_piso";

    }
    @PostMapping("/pisos")
    public String guardarPiso(@ModelAttribute("piso") Piso piso, Precio precio){
        
         
        servicio.guardarPiso(piso);
        return "redirect:/pisos";
    }
    @GetMapping("/pisos/editar/{id}")
    public String mostrarFormularioEditar(@PathVariable Long id, Model modelo){
        modelo.addAttribute("piso", servicio.obtenerPisoPorId(id));
        List<Precio> precios = precioRepository.findAll();
        modelo.addAttribute("precios", precios);
        return "editar_piso";

    }

    @PostMapping("/pisos/{id}")
    public String actualizarPisos(@PathVariable Long id,@ModelAttribute("piso") Piso piso, Model modelo){
        
        Piso pisoExistente = servicio.obtenerPisoPorId(id);
        pisoExistente.setId(id);
        pisoExistente.setNumero(piso.getNumero());
        pisoExistente.setTipo_v(piso.getTipo_v());
        pisoExistente.setCupos_v(piso.getCupos_v());
        servicio.actualizarPiso(pisoExistente);
        return "redirect:/pisos";

    }
    @GetMapping("/pisos/{id}")
    public String eliminarPiso(@PathVariable Long id){
        servicio.eliminarPiso(id);
        return "redirect:/pisos";

    }
    
    
    
}
