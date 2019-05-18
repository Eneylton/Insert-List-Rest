package com.crud.br.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.br.Model.Categoria;

@Repository
public interface CategoriaRepositories  extends JpaRepository<Categoria, Integer> {

}
