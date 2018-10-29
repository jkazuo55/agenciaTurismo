package com.cronograma.springboot.backend.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cronograma.springboot.backend.apirest.models.entity.Categoria;
import com.cronograma.springboot.backend.apirest.models.services.ICategoriaService;



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
public class CategoriaRestController {
	
	@Autowired
	private ICategoriaService categoriaService;
	
	@GetMapping("/categorias")
	public List<Categoria> index(){
		return categoriaService.findAll();
	}
	
	@GetMapping("/categorias/{id}")
	public Categoria show(@PathVariable Long id){
		return categoriaService.findById(id);
	}
	
	//crear
	@PostMapping("/categorias")
	@ResponseStatus(HttpStatus.CREATED)
	public Categoria create(@RequestBody Categoria categoria) {
		return categoriaService.save(categoria);
	}
	
	@PutMapping("/categorias/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Categoria update(@RequestBody Categoria categoria, @PathVariable Long id) {
		Categoria categoriaActual = categoriaService.findById(id);
		
		categoriaActual.setNombreCat(categoria.getNombreCat());
		categoriaActual.setDescripcionCat(categoria.getDescripcionCat());	
		
		return categoriaService.save(categoriaActual);
	}
	
	@DeleteMapping("/categorias/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		categoriaService.delete(id);
	}

}
