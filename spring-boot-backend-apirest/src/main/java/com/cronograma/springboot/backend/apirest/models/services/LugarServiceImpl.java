package com.cronograma.springboot.backend.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cronograma.springboot.backend.apirest.models.dao.ILugarDao;
import com.cronograma.springboot.backend.apirest.models.entity.Lugar;

@Service
public class LugarServiceImpl implements ILugarService{	
	
	@Autowired
	private ILugarDao lugarDao;

	@Override
	@Transactional(readOnly = true)
	public List<Lugar> findAll() {
		// TODO Auto-generated method stub
		return (List<Lugar>)lugarDao.findAll();
	}
	
	@Override
	@Transactional(readOnly=true)
	public Lugar findById(Long id) {
		// TODO Auto-generated method stub
		return lugarDao.findById(id).orElse(null);
	}

	@Override
	@Transactional()
	public Lugar save(Lugar cronograma) {
		// TODO Auto-generated method stub
		return lugarDao.save(cronograma);
	}

	@Override
	@Transactional()
	public void delete(Long id) {
		// TODO Auto-generated method stub
		lugarDao.deleteById(id);
		
	}
	

}
