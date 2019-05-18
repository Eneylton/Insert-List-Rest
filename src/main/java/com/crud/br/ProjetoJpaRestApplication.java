package com.crud.br;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.crud.br.Model.Categoria;
import com.crud.br.Model.Produto;
import com.crud.br.Repositories.CategoriaRepositories;
import com.crud.br.Repositories.ProdutoRepositories;

@SpringBootApplication
public class ProjetoJpaRestApplication implements CommandLineRunner {

	@Autowired
	private CategoriaRepositories categoriaRepo;
	
	@Autowired
	private ProdutoRepositories prodRpos;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ProjetoJpaRestApplication.class, args);
	}

	
	@Override
	public void run(String... args) throws Exception {
		
		Categoria c1 = new Categoria(null,"Informática");
		Categoria c2 = new Categoria(null,"Imovél");
		
		Produto p1 = new Produto(null,"Nootbook",234.67);
		Produto p2 = new Produto(null,"Monitor 29", 976.89);
		Produto p3 = new Produto(null,"Mesa",567.00);
		
		p1.getCategorias().addAll(Arrays.asList(c1));
		p2.getCategorias().addAll(Arrays.asList(c1));
		p3.getCategorias().addAll(Arrays.asList(c2));
		
		c1.getProdutos().addAll(Arrays.asList(p1, p2));
		c2.getProdutos().addAll(Arrays.asList(p3));
		
		categoriaRepo.saveAll(Arrays.asList(c1,c2));
		prodRpos.saveAll(Arrays.asList(p1,p2,p3));
	}

}
