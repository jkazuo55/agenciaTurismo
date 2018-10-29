package com.cronograma.springboot.backend.apirest.models.services;

import java.util.List;

import com.cronograma.springboot.backend.apirest.models.entity.Categoria;


public interface ICategoriaService {
	
	public List<Categoria> findAll();
	public Categoria findById(Long id);
	public Categoria save(Categoria cronograma);
	public void delete(Long id);
}
