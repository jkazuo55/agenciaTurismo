package com.cronograma.springboot.backend.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cronograma.springboot.backend.apirest.models.entity.Paquete;
import com.cronograma.springboot.backend.apirest.models.services.IPaqueteService;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.ResponseStatus;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class PaqueteRestController {
	
	@Autowired
	private IPaqueteService paqueteService;
	
	@GetMapping("/paquetes")
	public List<Paquete> index(){
		return paqueteService.findAll();
	}
	
	@GetMapping("/paquetes/{id}")
	public Paquete show(@PathVariable Long id){
		return paqueteService.findById(id);
	}
	
	//crear
	@PostMapping("/paquetes")
	@ResponseStatus(HttpStatus.CREATED)
	public Paquete create(@RequestBody Paquete paquete) {
		return paqueteService.save(paquete);
	}
	
	@PutMapping("/paquetes/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Paquete update(@RequestBody Paquete paquete, @PathVariable Long id) {
		Paquete paqueteActual = paqueteService.findById(id);
		
		paqueteActual.setCostoPaquete(paquete.getCostoPaquete());
		paqueteActual.setCupoMinPaquete(paquete.getCupoMinPaquete());
		paqueteActual.setDescripcionPaquete(paquete.getDescripcionPaquete());
		paqueteActual.setEstadoPaquete(paquete.getDescripcionPaquete());
		paqueteActual.setNombrePaquete(paquete.getNombrePaquete());
		
		return paqueteService.save(paqueteActual);
	}
	
	@DeleteMapping("/paquetes/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		paqueteService.delete(id);
	}
}
