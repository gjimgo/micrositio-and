package com.and.micrositio.api.models.services;

import java.util.List;

import com.and.micrositio.api.models.entity.Modulo;

public interface IModuloService {
	
	public List<Modulo> findAll();
	
	public Modulo findById(Long id);
	
	public Modulo save(Modulo modulo);
	
	public void delete(Long id);

}
