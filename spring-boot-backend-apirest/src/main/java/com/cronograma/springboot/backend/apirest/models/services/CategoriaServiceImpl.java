package com.cronograma.springboot.backend.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cronograma.springboot.backend.apirest.models.dao.ICategoriaDao;
import com.cronograma.springboot.backend.apirest.models.entity.Categoria;


@Service
public class CategoriaServiceImpl implements ICategoriaService {
	
	@Autowired
	private ICategoriaDao categoriaDao;
	

	@Override
	@Transactional(readOnly=true)
	public List<Categoria> findAll() {
		// TODO Auto-generated method stub
		return (List<Categoria>) categoriaDao.findAll();
	}
	
	@Override
	@Transactional(readOnly=true)
	public Categoria findById(Long id) {
		// TODO Auto-generated method stub
		return categoriaDao.findById(id).orElse(null);
	}

	@Override
	@Transactional()
	public Categoria save(Categoria cronograma) {
		// TODO Auto-generated method stub
		return categoriaDao.save(cronograma);
	}

	@Override
	@Transactional()
	public void delete(Long id) {
		// TODO Auto-generated method stub
		categoriaDao.deleteById(id);
		
	}

}
