package com.and.micrositio.api.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.and.micrositio.api.models.dao.IModuloDao;
import com.and.micrositio.api.models.entity.Modulo;

@Service
public class ModuloServiceImpl implements IModuloService{
	
	@Autowired
	private IModuloDao moduloDao;
	@Override
	@Transactional(readOnly = true)
	public List<Modulo> findAll() {
		return (List<Modulo>) moduloDao.findAll(); //Return a list of modules
	}
	@Override
	@Transactional(readOnly = true)
	public Modulo findById(Long id) {
		// TODO Auto-generated method stub
		return moduloDao.findById(id).orElse(null);
	}
	
	@Override
	@Transactional
	public Modulo save(Modulo modulo) {
		// TODO Auto-generated method stub
		return moduloDao.save(modulo);
	}
	
	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		moduloDao.deleteById(id);
	}

}
