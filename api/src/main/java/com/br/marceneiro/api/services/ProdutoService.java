package com.br.marceneiro.api.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.List;

import com.br.marceneiro.api.models.Produto;
import com.br.marceneiro.api.models.Retorno;
import com.br.marceneiro.api.repositories.ProdutoRepository;
import com.br.marceneiro.api.services.interfaces.IProdutoService;

@Service
public class ProdutoService {

    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository materialRepository) {
        this.produtoRepository = materialRepository;
    }

    public List<Produto> listarMateriais() {
        return produtoRepository.findAll();
    }

    public Produto criarMaterial(Produto material) {
        return produtoRepository.save(material);
    }
    // @Autowired
    // ProdutoRepository repository;

    // @Autowired
    // Retorno retorno;

    // @Override
    // public ResponseEntity<?> cadastrarProduto(Produto produto) {
    //     if (produto.getNome() == null || produto.getNome().isEmpty()) {
    //         retorno.setMensagem("Insira um nome ao produto.");
    //         return ResponseEntity.badRequest().body(retorno);
    //     }
    //     if (produto.getPrecoMetroCubicos() == null || produto.getPrecoMetroCubicos().isNaN()) {
    //         retorno.setMensagem("Insira o preço por metro cúbico do produto.");
    //         return ResponseEntity.badRequest().body(retorno);
    //     }
    //     if (produto.getQuantidadePregos() == null || produto.getQuantidadePregos() < 0) {
    //         retorno.setMensagem("Insira a quantidade de pregos do produto.");
    //         return ResponseEntity.badRequest().body(retorno);
    //     }

    //     return new ResponseEntity<>(repository.save(produto), HttpStatus.CREATED);
    // }

    // @Override
    // public ResponseEntity<?> alterarProduto(Produto produto) {
    //     if (produto.getId() == null) {
    //         retorno.setMensagem("ID não informado");

    //         return new ResponseEntity<>(retorno, HttpStatus.BAD_REQUEST);
    //     } else if (repository.existsById(produto.getId())) {
    //         if (produto.getNome() == null || produto.getNome().isEmpty()) {
    //             retorno.setMensagem("Insira um nome ao produto.");
    //             return ResponseEntity.badRequest().body(retorno);
    //         }
    //         if (produto.getPrecoMetroCubicos() == null || produto.getPrecoMetroCubicos().isNaN()) {
    //             retorno.setMensagem("Insira o preço por metro cúbico do produto.");
    //             return ResponseEntity.badRequest().body(retorno);
    //         }
    //         if (produto.getQuantidadePregos() == null || produto.getQuantidadePregos() < 0) {
    //             retorno.setMensagem("Insira a quantidade de pregos do produto.");
    //             return ResponseEntity.badRequest().body(retorno);
    //         }
    //         cadastrarProduto(produto);
    //         return new ResponseEntity<>(HttpStatus.OK);
    //     }
    //     retorno.setMensagem("ID não existente");
    //     return new ResponseEntity<>(retorno, HttpStatus.BAD_REQUEST);
    // }

    // @Override
    // public ResponseEntity<?> listarProdutos() {
    //     return new ResponseEntity<>(repository.findAll(), HttpStatus.OK);
    // }

    // @Override
    // public ResponseEntity<?> deletarProduto(Long obj) {
    //     if (obj == null) {
    //         retorno.setMensagem("ID não informado");
    //         return new ResponseEntity<>(retorno, HttpStatus.BAD_REQUEST);
    //     } else if (repository.existsById(obj)) {
    //         Produto produto = repository.findByProdutoId(obj);
    //         repository.delete(produto);
    //         return new ResponseEntity<>(HttpStatus.OK);
    //     }
    //     retorno.setMensagem("ID não existente");
    //     return new ResponseEntity<>(retorno, HttpStatus.BAD_REQUEST);
    // }

    // @Override
    // public ResponseEntity<?> listarPorId(Long id) {
    //     if (id == null) {
    //         retorno.setMensagem("ID não informado");

    //         return new ResponseEntity<>(retorno, HttpStatus.BAD_REQUEST);
    //     } else if (repository.existsById(id)) {

    //         return new ResponseEntity<>(repository.findByProdutoId(id), HttpStatus.OK);
    //     }
    //     retorno.setMensagem("ID não existente");
    //     return new ResponseEntity<>(retorno, HttpStatus.BAD_REQUEST);
    // }
}
