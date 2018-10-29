package com.cronograma.springboot.backend.apirest.models.services;

import java.util.List;

import com.cronograma.springboot.backend.apirest.models.entity.Lugar;

public interface ILugarService {

	public List<Lugar> findAll();
	public Lugar findById(Long id);
	public Lugar save(Lugar lugar);
	public void delete(Long id);
}
