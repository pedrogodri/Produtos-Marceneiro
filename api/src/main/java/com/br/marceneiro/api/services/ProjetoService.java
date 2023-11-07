package com.br.marceneiro.api.services;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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

    public Projeto adicionarSubprojeto(Long idProjetoPai, Projeto subprojeto) {
        Optional<Projeto> projetoPaiOptional = projetoRepository.findById(idProjetoPai);
        if (projetoPaiOptional.isPresent()) {
            Projeto projetoPai = projetoPaiOptional.get();
            if (projetoPai.getSubprojetos() == null) {
                projetoPai.setSubprojetos(new ArrayList<>());
            }
            subprojeto.calcularCustoTotal();
            projetoPai.getSubprojetos().add(subprojeto);
            projetoPai.calcularCustoTotal();
            projetoRepository.save(projetoPai);
            return subprojeto;
        } else {
            throw new IllegalArgumentException("Projeto pai não encontrado");
        }
    }

    public List<Projeto> listarSubprojetos(Long idProjeto) {
        Optional<Projeto> projetoOptional = projetoRepository.findById(idProjeto);
        if (projetoOptional.isPresent()) {
            Projeto projeto = projetoOptional.get();
            if (projeto.getSubprojetos() != null) {
                return projeto.getSubprojetos();
            }
        }
        return new ArrayList<>();
    }
}
