package com.cronograma.springboot.backend.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cronograma.springboot.backend.apirest.models.entity.Lugar;
import com.cronograma.springboot.backend.apirest.models.services.ILugarService;
@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class LugarRestController {
	
	@Autowired
	private ILugarService lugarService;
	
	@GetMapping("/lugares")
	public List<Lugar> index(){
		return lugarService.findAll();
	}
	
	@GetMapping("/lugares/{id}")
	public Lugar show(@PathVariable Long id){
		return lugarService.findById(id);
	}
	
	//crear
	@PostMapping("/lugares")
	@ResponseStatus(HttpStatus.CREATED)
	public Lugar create(@RequestBody Lugar lugar) {
		return lugarService.save(lugar);
	}
	
	@PutMapping("/lugares/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Lugar update(@RequestBody Lugar lugar, @PathVariable Long id) {
		Lugar lugarActual = lugarService.findById(id);
		
		lugarActual.setNombreLugar(lugar.getNombreLugar());
		lugarActual.setDescripcionLugar(lugar.getDescripcionLugar());
		
		return lugarService.save(lugarActual);
	}
	
	@DeleteMapping("/lugares/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		lugarService.delete(id);
	}

	
}
