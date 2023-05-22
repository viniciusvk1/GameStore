package com.github.viniciusvk1.GameStore.repository;

import com.github.viniciusvk1.GameStore.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

    public List<Categoria> findAllByGeneroContainingIgnoreCase(@Param("genero") String genero);


}