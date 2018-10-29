package com.cronograma.springboot.backend.apirest.models.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cronograma.springboot.backend.apirest.models.dao.IPaqueteDao;

import com.cronograma.springboot.backend.apirest.models.entity.Paquete;

@Service
public class PaqueteServiceImpl implements IPaqueteService {
	
	@Autowired
	private IPaqueteDao paqueteDao;

	@Override
	@Transactional(readOnly=true)
	public List<Paquete> findAll() {
		// TODO Auto-generated method stub
		return (List<Paquete>) paqueteDao.findAll();
	}
	
	@Override
	@Transactional(readOnly=true)
	public Paquete findById(Long id) {
		// TODO Auto-generated method stub
		return paqueteDao.findById(id).orElse(null);
	}

	@Override
	@Transactional()
	public Paquete save(Paquete cronograma) {
		// TODO Auto-generated method stub
		return paqueteDao.save(cronograma);
	}

	@Override
	@Transactional()
	public void delete(Long id) {
		// TODO Auto-generated method stub
		paqueteDao.deleteById(id);
		
	}

}
