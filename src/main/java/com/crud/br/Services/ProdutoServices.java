package com.crud.br.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.br.Model.Produto;
import com.crud.br.Repositories.ProdutoRepositories;

@Service
public class ProdutoServices {

	@Autowired
	private ProdutoRepositories repos;
	
	public Produto buscarPorID(Integer id) {
		
		Optional<Produto> prod  = repos.findById(id);
		
		return prod.orElse(null);
 	}
	
}
