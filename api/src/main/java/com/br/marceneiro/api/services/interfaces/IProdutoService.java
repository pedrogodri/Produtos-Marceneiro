package com.br.marceneiro.api.services.interfaces;

import org.springframework.http.ResponseEntity;

import com.br.marceneiro.api.models.Produto;

public interface IProdutoService {
    ResponseEntity<?> cadastrarProduto(Produto produto);
    ResponseEntity<?> alterarProduto(Produto produto);
    ResponseEntity<?> listarProdutos();
    ResponseEntity<?> deletarProduto(Long obj);
    ResponseEntity<?> ListarPorId(Long id);
}
