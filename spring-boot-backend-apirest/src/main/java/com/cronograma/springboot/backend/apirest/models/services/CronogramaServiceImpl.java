package com.cronograma.springboot.backend.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cronograma.springboot.backend.apirest.models.dao.ICronogramaDao;
import com.cronograma.springboot.backend.apirest.models.entity.Cronograma;

@Service
public class CronogramaServiceImpl implements ICronogramaService{
	@Autowired
	private ICronogramaDao cronogramaDao;

	@Override
	@Transactional(readOnly=true)
	public List<Cronograma> findAll() {
		// TODO Auto-generated method stub
		return (List<Cronograma>) cronogramaDao.findAll();
	}
	

	@Override
	@Transactional(readOnly=true)
	public Cronograma findById(Long id) {
		// TODO Auto-generated method stub
		return cronogramaDao.findById(id).orElse(null);
	}

	@Override
	@Transactional()
	public Cronograma save(Cronograma cronograma) {
		// TODO Auto-generated method stub
		return cronogramaDao.save(cronograma);
	}

	@Override
	@Transactional()
	public void delete(Long id) {
		// TODO Auto-generated method stub
		cronogramaDao.deleteById(id);
		
	} 
}
