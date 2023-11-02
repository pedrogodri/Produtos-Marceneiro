package com.br.marceneiro.api.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "projetos")
@Getter
@Setter
public class Projeto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private double quantidadeMetrosCubicos;
    private double custoTotal;

    @ManyToOne
    private Produto produto;

    public void calcularCustoTotal() {
        if (this.produto != null) {
            this.custoTotal = this.quantidadeMetrosCubicos * (this.produto.getCustoMadeiraPorMetroCubico() + this.produto.getQuantidadePregoPorMetroCubico());
        }
    }
}
