package com.br.marceneiro.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.br.marceneiro.api.controllers.interfaces.IProdutoController;
import com.br.marceneiro.api.models.Produto;
import com.br.marceneiro.api.services.ProdutoService;

@CrossOrigin(origins = "*")
@RestController
public class ProdutoController implements IProdutoController {

    @Autowired
    ProdutoService service;

    @Override
    public ResponseEntity<?> cadastrarProduto(Produto produto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cadastrarProduto'");
    }

    @Override
    public ResponseEntity<?> alterarProduto(Produto produto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'alterarProduto'");
    }

    @Override
    public ResponseEntity<?> listarProdutos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarProdutos'");
    }

    @Override
    public ResponseEntity<?> selecionarioPorId(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'selecionarioPorId'");
    }

    @Override
    public ResponseEntity<?> deletarProduto(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deletarProduto'");
    }
    
}
