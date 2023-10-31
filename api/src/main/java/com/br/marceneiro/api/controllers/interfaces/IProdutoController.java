package com.br.marceneiro.api.controllers.interfaces;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.br.marceneiro.api.models.Produto;

public interface IProdutoController {
    ResponseEntity<?> cadastrarProduto(@RequestBody Produto produto);
    ResponseEntity<?> alterarProduto(@RequestBody Produto produto);
    ResponseEntity<?> listarProdutos();
    ResponseEntity<?> selecionarioPorId(@PathVariable Long id);
    ResponseEntity<?> deletarProduto(@PathVariable Long id);
}
