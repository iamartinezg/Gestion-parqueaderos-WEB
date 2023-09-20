package com.proyectodw.demo.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.proyectodw.demo.entidad.Piso;
import com.proyectodw.demo.servicio.PisoServicio;

@Controller
public class PisoControlador {

    @Autowired
    private PisoServicio servicio;

    @GetMapping({"/pisos","/"})
    public String listarPisos(Model modelo){
        modelo.addAttribute("pisos", servicio.listarTodosLosPisos());
        return "pisos"; //retorna al archivo pisos
    }

    @GetMapping("/pisos/nuevo")
    public String crearPisoFormulario(Model modelo){
        Piso piso = new Piso();
        modelo.addAttribute("piso", piso);
        return "crear_piso";

    }
    @PostMapping("/pisos")
    public String guardarPiso(@ModelAttribute("piso") Piso piso){
        switch (piso.getTipo_v()) { 
            case "carro":
             piso.setCupos_v(30);
             break;
            case "moto":
             piso.setCupos_v(60);
             break;
            case "Bus" :
             piso.setCupos_v(15);
             break;
          }
        servicio.guardarPiso(piso);
        return "redirect:/pisos";
    }
    @GetMapping("/pisos/editar/{id}")
    public String mostrarFormularioEditar(@PathVariable Long id, Model modelo){
        modelo.addAttribute("piso", servicio.obtenerPisoPorId(id));
        return "editar_piso";

    }

    @PostMapping("/pisos/{id}")
    public String actualizarPisos(@PathVariable Long id,@ModelAttribute("piso") Piso piso, Model modelo){
        Piso pisoExistente = servicio.obtenerPisoPorId(id);
        pisoExistente.setId(id);
        pisoExistente.setNumero(piso.getNumero());
        pisoExistente.setTipo_v(piso.getTipo_v());
        pisoExistente.setCupos_v(piso.getCupos_v());
        switch (piso.getTipo_v()) { 
            case "carro":
             pisoExistente.setCupos_v(30);
             break;
            case "moto":
             pisoExistente.setCupos_v(60);
             break;
            case "Bus" :
             pisoExistente.setCupos_v(15);
             break;
          }

        servicio.actualizarPiso(pisoExistente);
        return "redirect:/pisos";

    }
    @GetMapping("/pisos/{id}")
    public String eliminarPiso(@PathVariable Long id){
        servicio.eliminarPiso(id);
        return "redirect:/pisos";

    }
    
    
}
