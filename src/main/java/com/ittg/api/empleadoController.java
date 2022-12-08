package com.ittg.api;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping; 
import org.springframework.web.bind.annotation. PostMapping;
import org.springframework.web.bind.annotation. PutMapping;
import org.springframework.web.bind.annotation.RequestBody; 
import org.springframework.web.bind.annotation. RestController;

@RestController
public class empleadoController {
	//http://localhost:9090/empleados
		@Autowired
		 empleadoRepository repository; 
		//EmpleadoController (EmpleadoRepository repository){ 
//			this.repository=repository;
	//}
	@PostMapping("/empleados")
	empleados crear (@RequestBody empleados nuevoEmpleado) { 
		return repository.save(nuevoEmpleado);
	}

	@GetMapping("/empleados")
	List<empleados> obtenerTodos(){ 
		return repository.findAll();
	}

	@GetMapping("/trabajador") 
	public void obtener() { 
		System.out.println("Estoy en el metodo obtener");

	}

	@PutMapping("controladores/{id}")
	public void actualizar() { 
		System.out.println("Estoy en el metodo actualizar");
	}

	@DeleteMapping("Controladores/{id}")
	public void eliminar () { 
		System.out.println("Estoy en el metodo eliminar");

	}
}
