package com.br.marceneiro.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.br.marceneiro.api.models.Produto;
import com.br.marceneiro.api.models.Retorno;
import com.br.marceneiro.api.repositories.ProdutoRepository;
import com.br.marceneiro.api.services.interfaces.IProdutoService;

@Service
public class ProdutoService implements IProdutoService {
    @Autowired
    ProdutoRepository repository;

    @Autowired
    Retorno retorno;

    @Override
    public ResponseEntity<?> cadastrarProduto(Produto produto) {
        return new ResponseEntity<>(repository.save(produto), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<?> alterarProduto(Produto produto) {
        cadastrarProduto(produto);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<?> listarProdutos() {
        return new ResponseEntity<>(repository.findAll(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<?> deletarProduto(Long obj) {
        if (obj == null) {
            retorno.setMensagem("ID não informado");
            return new ResponseEntity<>(retorno, HttpStatus.BAD_REQUEST);
        } else if (repository.existsById(obj)) {
            Produto produto = repository.findByProdutoId(obj);
            repository.delete(produto);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        retorno.setMensagem("ID não existente");
        return new ResponseEntity<>(retorno, HttpStatus.BAD_REQUEST);
    }

    @Override
    public ResponseEntity<?> ListarPorId(Long id) {
        if (id == null) {
            retorno.setMensagem("ID não informado");

            return new ResponseEntity<>(retorno, HttpStatus.BAD_REQUEST);
        } else if (repository.existsById(id)) {

            return new ResponseEntity<>(repository.findByProdutoId(id), HttpStatus.OK);
        }
        retorno.setMensagem("ID não existente");
        return new ResponseEntity<>(retorno, HttpStatus.BAD_REQUEST);
    }
}
