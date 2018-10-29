package com.cronograma.springboot.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.cronograma.springboot.backend.apirest.models.entity.Cronograma;

public interface ICronogramaDao extends CrudRepository<Cronograma, Long> {

}
