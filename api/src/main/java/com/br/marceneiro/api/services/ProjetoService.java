package com.br.marceneiro.api.services;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.br.marceneiro.api.models.Projeto;
import com.br.marceneiro.api.repositories.ProjetoRepository;

@Service
public class ProjetoService {

    @Autowired
    private final ProjetoRepository projetoRepository;

    public ProjetoService(ProjetoRepository projetoRepository) {
        this.projetoRepository = projetoRepository;
    }

    public List<Projeto> listarProjetos() {
        return projetoRepository.findAll();
    }

    public Optional<Projeto> encontrarProjetoPorId(Long id) {
        return projetoRepository.findById(id);
    }

    public Projeto criarProjeto(Projeto projeto) {
        return projetoRepository.save(projeto);
    }

    public Projeto atualizarProjeto(Long id, Projeto projeto) {
        if (projetoRepository.existsById(id)) {
            projeto.setId(id);
            return projetoRepository.save(projeto);
        } else {
            throw new IllegalArgumentException("Projeto não encontrado");
        }
    }

    public void excluirProjeto(Long id) {
        projetoRepository.deleteById(id);
    }

    // @Autowired
    // private ProjetoRepository projetoRepository;

    // @Autowired
    // private ProdutoRepository produtoRepository;

    // @Override
    // public Projeto criarProjeto(Projeto projeto) {
    // return projetoRepository.save(projeto);
    // }

    // @Override
    // public Projeto getProjetoPorId(Long id) {
    // Optional<Projeto> optionalProjeto = projetoRepository.findById(id);

    // if (optionalProjeto.isPresent()) {
    // return optionalProjeto.get();
    // } else {
    // return null;
    // }
    // }

    // @Override
    // public Projeto atualizarProjeto(Long id, Projeto projeto) {
    // projeto.setId(id);
    // return projetoRepository.save(projeto);
    // }

    // @Override
    // public void deletarProjeto(Long id) {
    // projetoRepository.deleteById(id);
    // }

    // @Override
    // public Double calcularCustoDoProjeto(Long projetoId) {
    // Projeto projeto = getProjetoPorId(projetoId);
    // Double custoMaterial = calcularCustoMaterial(projeto);
    // Double custoPregos = projeto.getQuantidadePregos() * getPrecoUnitarioPrego();

    // return custoMaterial + custoPregos;
    // }

    // @Override
    // public Double calcularCustoMaterial(Projeto projeto) {
    // Produto produto =
    // produtoRepository.findByProdutoId(projeto.getQuantidadeMaterialId());

    // return produto.getPrecoMetroCubicos() * projeto.getQuantidadeMaterial();
    // }

    // @Override
    // public Double getPrecoUnitarioPrego() {
    // //Custo do prego
    // return 2.0;
    // }

    // @Override
    // public ResponseEntity<?> listarProjetos() {
    // return new ResponseEntity<>(produtoRepository.findAll(), HttpStatus.OK);
    // }

}
