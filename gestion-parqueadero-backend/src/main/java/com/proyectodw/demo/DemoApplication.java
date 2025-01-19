package com.proyectodw.demo;


import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.proyectodw.demo.entidad.Rol;
import com.proyectodw.demo.entidad.Usuario;
import com.proyectodw.demo.entidad.UsuarioRol;
import com.proyectodw.demo.servicio.UsuarioServicio;



@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Autowired
	private UsuarioServicio usuarioServicio;

	@Override
	public void run(String... args) throws Exception {
		/* //PRUEBA DE INSERCIONDE DATOS A BD
		Piso piso1 = new Piso(1, "motos" , 20);
		repositorio.save(piso1);

		Piso piso2 = new Piso(2, "carros" , 10);
		repositorio.save(piso2);
		Precio precio1 = new Precio("carro",110,20);
		repositorioPrecio.save(precio1);
		Precio precio2 = new Precio("moto",55);
		repositorioPrecio.save(precio2);
		Precio precio3 = new Precio("bus",220);
		repositorioPrecio.save(precio3);
 
		Usuario usuario = new Usuario();
		usuario.setNombre("Ivan");
		usuario.setApellido("Martinez");
		usuario.setUsername("iamartinezg");
		usuario.setPassword("952612");
		usuario.setTelefono("3138039679");
		
		Rol rol = new Rol();
		rol.setRolId(1L);
		rol.setNombre("ADMIN");

		Set<UsuarioRol> usuarioRoles = new HashSet<>();
		UsuarioRol usuarioRol = new UsuarioRol();
		usuarioRol.setRol(rol);
		usuarioRol.setUsuario(usuario);
		usuarioRoles.add(usuarioRol);

		Usuario usuarioGuardado = usuarioServicio.guardarUsuario(usuario, usuarioRoles);
		System.out.println(usuarioGuardado.getUsername());*/

		
	}

	

}
