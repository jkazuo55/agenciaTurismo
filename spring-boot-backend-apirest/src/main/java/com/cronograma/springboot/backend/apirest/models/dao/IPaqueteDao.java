package com.cronograma.springboot.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.cronograma.springboot.backend.apirest.models.entity.Paquete;

public interface IPaqueteDao extends CrudRepository<Paquete, Long>{

}
