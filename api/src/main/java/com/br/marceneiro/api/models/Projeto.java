package com.br.marceneiro.api.models;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "projeto_pai_id")
    private List<Projeto> subprojetos;

    public void calcularCustoTotal() {
        double custoSubprojetos = 0;

        if (this.subprojetos != null) {
            for (Projeto subprojeto : this.subprojetos) {
                subprojeto.calcularCustoTotal();
                custoSubprojetos += subprojeto.getCustoTotal();
            }
        }

        this.custoTotal = this.quantidadeMetrosCubicos * (this.produto.getCustoMadeiraPorMetroCubico() + this.produto.getQuantidadePregoPorMetroCubico()) + custoSubprojetos;
    }
}
