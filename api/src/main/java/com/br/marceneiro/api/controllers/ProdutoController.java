package com.br.marceneiro.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.marceneiro.api.controllers.interfaces.IProdutoController;
import com.br.marceneiro.api.models.Produto;
import com.br.marceneiro.api.services.ProdutoService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/produtos")
public class ProdutoController implements IProdutoController {

    @Autowired
    ProdutoService service;

    @Override
    @PostMapping
    public ResponseEntity<?> cadastrarProduto(@RequestBody Produto produto) {
        return service.cadastrarProduto(produto);
    }
    
    @Override
    @PutMapping
    public ResponseEntity<?> alterarProduto(@RequestBody Produto produto) {
       return service.alterarProduto(produto);
    }
    
    @Override
    @GetMapping
    public ResponseEntity<?> listarProdutos() {
        return service.listarProdutos();
    }

    @Override
    @GetMapping("{id}")
    public ResponseEntity<?> selecionarioPorId(@PathVariable Long id) {
        return service.listarPorId(id);
    }

    @Override
    @DeleteMapping("{id}")
    public ResponseEntity<?> deletarProduto(@PathVariable Long id) {
        return service.deletarProduto(id);
    }
    
}
