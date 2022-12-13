package com.and.micrositio.api.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.and.micrositio.api.models.entity.Modulo;
import com.and.micrositio.api.models.services.IModuloService;

@CrossOrigin(origins = {"http://localhost:4200"}) //Permite conectar la aplicación con Angular (Frontend)
@RestController
@RequestMapping("/and")
public class ModuloRestController {
	
	@Autowired
	private IModuloService moduloService;
	
	@GetMapping("/modulos")
	public List<Modulo> index(){
		return moduloService.findAll();
	}
	
	@GetMapping("/modulo/{id}")
	public Modulo show(@PathVariable Long id) {
		return moduloService.findById(id);
	}
	
	@PostMapping("/modulos")
	@ResponseStatus(HttpStatus.CREATED)
	public Modulo create(@RequestBody Modulo modulo) {
		return moduloService.save(modulo);
	}
}
