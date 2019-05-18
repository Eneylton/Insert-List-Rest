package com.crud.br.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.br.Model.Categoria;
import com.crud.br.Repositories.CategoriaRepositories;

@Service
public class CategoriaServices {

	@Autowired
	private CategoriaRepositories repos;
	
	
	public Categoria buscarPorID(Integer id) {
		
		Optional<Categoria> cat = repos.findById(id);
		
		return cat.orElse(null);
		
	}
}
