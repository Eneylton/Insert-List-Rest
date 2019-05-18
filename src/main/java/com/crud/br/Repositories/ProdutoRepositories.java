package com.crud.br.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

import com.crud.br.Model.Produto;

@RestController
public interface ProdutoRepositories extends JpaRepository<Produto, Integer> {

}
