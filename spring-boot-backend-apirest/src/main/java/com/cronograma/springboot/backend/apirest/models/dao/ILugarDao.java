package com.cronograma.springboot.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.cronograma.springboot.backend.apirest.models.entity.Lugar;

public interface ILugarDao extends CrudRepository<Lugar, Long>{

}
