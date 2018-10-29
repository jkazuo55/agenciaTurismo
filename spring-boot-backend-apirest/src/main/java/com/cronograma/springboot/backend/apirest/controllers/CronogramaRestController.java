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

import com.cronograma.springboot.backend.apirest.models.entity.Cronograma;
import com.cronograma.springboot.backend.apirest.models.services.ICronogramaService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class CronogramaRestController {
	
	@Autowired
	private ICronogramaService cronogramaService;
	
	@GetMapping("/cronogramas")
	public List<Cronograma> index(){
		return cronogramaService.findAll();
	}
	
	@GetMapping("/cronogramas/{id}")
	public Cronograma show(@PathVariable Long id){
		return cronogramaService.findById(id);
	}
	
	//crear
	@PostMapping("/cronogramas")
	@ResponseStatus(HttpStatus.CREATED)
	public Cronograma create(@RequestBody Cronograma cronograma) {
		return cronogramaService.save(cronograma);
	}
	
	@PutMapping("/cronogramas/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Cronograma update(@RequestBody Cronograma cronograma, @PathVariable Long id) {
		Cronograma cronogramaActual = cronogramaService.findById(id);
		
		cronogramaActual.setNombreCro(cronograma.getNombreCro());
		cronogramaActual.setDescripcionCro(cronograma.getDescripcionCro());
		cronogramaActual.setHoraCro(cronograma.getHoraCro());
		cronogramaActual.setFechaCro(cronograma.getFechaCro());
		
		
		return cronogramaService.save(cronogramaActual);
	}
	
	@DeleteMapping("/cronogramas/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		cronogramaService.delete(id);
	}

	
	
	
	
}
