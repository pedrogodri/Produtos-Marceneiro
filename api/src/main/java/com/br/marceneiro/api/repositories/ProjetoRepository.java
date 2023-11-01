package com.br.marceneiro.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.marceneiro.api.models.Projeto;

public interface ProjetoRepository extends JpaRepository<Projeto, Long> {
    
}
