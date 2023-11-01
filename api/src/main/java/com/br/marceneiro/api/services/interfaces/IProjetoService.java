package com.br.marceneiro.api.services.interfaces;

import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.br.marceneiro.api.models.Projeto;

public interface IProjetoService {
    Projeto criarProjeto(Projeto projeto);
    Projeto getProjetoPorId(Long id);
    Projeto atualizarProjeto(Long id, Projeto projeto);
    ResponseEntity<?> listarProjetos();
    void deletarProjeto(Long id);
    Double calcularCustoDoProjeto(Long projetoId);
    Double calcularCustoMaterial(Projeto projeto);
    Double getPrecoUnitarioPrego();
}
