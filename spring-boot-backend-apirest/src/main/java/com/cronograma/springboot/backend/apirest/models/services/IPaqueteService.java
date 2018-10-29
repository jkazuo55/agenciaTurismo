package com.cronograma.springboot.backend.apirest.models.services;

import java.util.List;

import com.cronograma.springboot.backend.apirest.models.entity.Paquete;

public interface IPaqueteService {
	public List<Paquete> findAll();
	public Paquete findById(Long id);
	public Paquete save(Paquete cronograma);
	public void delete(Long id);
}
