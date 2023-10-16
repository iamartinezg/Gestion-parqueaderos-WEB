package com.proyectodw.demo;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	

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
		repositorioPrecio.save(precio3);*/
		
	}
	


}
