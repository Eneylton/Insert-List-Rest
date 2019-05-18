package com.crud.br.Resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.crud.br.Model.Produto;
import com.crud.br.Services.ProdutoServices;

@RestController
@RequestMapping(value = "/produtos")
public class ProdutoResources {
	
	@Autowired
	private ProdutoServices service;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id){
		
		Produto prod = service.buscarPorID(id);
		
		return ResponseEntity.ok().body(prod);
	}

}
