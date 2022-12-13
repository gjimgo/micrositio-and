package com.and.micrositio.api.models.services;

import java.util.List;

import com.and.micrositio.api.models.entity.Perfil;

public interface IPerfilService {
	
	public List<Perfil> findAll();
	
	public Perfil findById(Long id);
	
	public Perfil save(Perfil perfil);
	
	public void delete(Long id);
}
