package com.br.marceneiro.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.br.marceneiro.api.models.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    @Query("SELECT p FROM Produtos p WHERE p.id = :id")
    Produto findByProdutoId(Long id);
}
