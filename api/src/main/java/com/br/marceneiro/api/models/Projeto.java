package com.br.marceneiro.api.models;

import java.util.List;

import jakarta.persistence.Entity;

@Entity

public class Projeto {
    private String nome;
    private List<Produto> produtosNecessarios;
    private List<Integer> quantidadeMaterial;
}
