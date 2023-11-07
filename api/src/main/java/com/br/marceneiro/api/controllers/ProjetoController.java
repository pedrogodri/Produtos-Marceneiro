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
import java.util.List;

import com.br.marceneiro.api.models.Produto;
import com.br.marceneiro.api.models.Projeto;
import com.br.marceneiro.api.services.ProjetoService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/projetos")
public class ProjetoController {

    @Autowired
    private ProjetoService projetoService;

    @PostMapping
    public Projeto criarProjeto(@RequestBody Projeto projeto) {
        projeto.calcularCustoTotal();
        return projetoService.criarProjeto(projeto);
    }

    @GetMapping
    public List<Projeto> listarProjetos() {
        return projetoService.listarProjetos();
    }

    @PostMapping("/{id}/subprojetos")
    public Projeto criarSubprojeto(@PathVariable Long id, @RequestBody Projeto subprojeto) {
        subprojeto.calcularCustoTotal();
        return projetoService.adicionarSubprojeto(id, subprojeto);
    }

    @GetMapping("/{id}/subprojetos")
    public List<Projeto> listarSubprojetos(@PathVariable Long id) {
        return projetoService.listarSubprojetos(id);
    }
}
