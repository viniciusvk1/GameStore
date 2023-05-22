package com.github.viniciusvk1.GameStore.repository;

import com.github.viniciusvk1.GameStore.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProdutoRepository extends JpaRepository {

    public List<Produto> findAllByNomeContainingIgnoreCase(@Param("nome") String nome);

}