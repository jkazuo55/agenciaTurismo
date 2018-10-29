package com.cronograma.springboot.backend.apirest.models.services;

import java.util.List;

import com.cronograma.springboot.backend.apirest.models.entity.Cronograma;

public interface ICronogramaService {
	public List<Cronograma> findAll();
	public Cronograma findById(Long id);
	public Cronograma save(Cronograma cronograma);
	public void delete(Long id);
}
