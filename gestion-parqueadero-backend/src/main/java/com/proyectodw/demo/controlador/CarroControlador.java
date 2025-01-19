package com.proyectodw.demo.controlador;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyectodw.demo.entidad.Carro;
import com.proyectodw.demo.excepciones.ResourceNotFoundException;
import com.proyectodw.demo.repositorio.CarroRepositorio;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://localhost:4200")
public class CarroControlador {

    @Autowired
    private CarroRepositorio repositorio;

    //Listar todos los carros
    @GetMapping("/carros")
    public List <Carro> listarTodosLosCarros(){
        return repositorio.findAll();
    }
    //guardar un carro
    @PostMapping("/carros")
    public Carro guardarCarro(@RequestBody Carro carro){
        return repositorio.save(carro);
    }
    //Buscar un carro por id 
    @GetMapping("/carros/{id}")
    public ResponseEntity<Carro> obtnerCarroPorId(@PathVariable Long id){
        Carro carro = repositorio.findById(id).orElseThrow(() -> new ResourceNotFoundException("No existe el carro con el id: " + id));
        return ResponseEntity.ok(carro);
    }

    @PutMapping("/carros/{id}")
    public ResponseEntity<Carro> actualizarCarro(@PathVariable Long id, @RequestBody Carro detallesCarro){
        Carro carro = repositorio.findById(id).orElseThrow(() -> new ResourceNotFoundException("No existe el carro con el id: " + id));
        carro.setPlaca(detallesCarro.getPlaca());
        carro.setNum_piso(detallesCarro.getNum_piso());
        carro.setTipo_v(detallesCarro.getTipo_v());
        carro.setH_ingreso(detallesCarro.getH_ingreso());
        carro.setH_salida(detallesCarro.getH_salida());
        carro.setValor_a_pagar(detallesCarro.getValor_a_pagar());
        Carro carroActualizado = repositorio.save(carro);
        return ResponseEntity.ok(carroActualizado);
    }
    //este metodo sirve para eliminar un empleado
	@DeleteMapping("/carros/{id}")
	public ResponseEntity<Map<String,Boolean>> eliminarCarro(@PathVariable Long id){
		Carro carro = repositorio.findById(id)
				            .orElseThrow(() -> new ResourceNotFoundException("No existe el carro con el ID : " + id));
		
		repositorio.delete(carro);
		Map<String, Boolean> respuesta = new HashMap<>();
		respuesta.put("eliminar",Boolean.TRUE);
		return ResponseEntity.ok(respuesta);
    }
    


    
}
