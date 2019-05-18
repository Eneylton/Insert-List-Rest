package com.crud.br.Resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.crud.br.Model.Categoria;
import com.crud.br.Services.CategoriaServices;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResources {
	
	@Autowired
    private CategoriaServices service;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id){
		
		Categoria cat = service.buscarPorID(id);
		
		return ResponseEntity.ok().body(cat);
		
	}
}
