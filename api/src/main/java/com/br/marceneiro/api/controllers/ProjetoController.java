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
    // @Autowired
    // public ProjetoService service;


    // @PostMapping
    // public Projeto criarProjeto(@RequestBody Projeto projeto) {
    //     return service.criarProjeto(projeto);
    // }

    // @GetMapping("/{id}")
    // public Projeto getProjetoPorId(@PathVariable Long id) {
    //     return service.getProjetoPorId(id);
    // }

    // @PutMapping("/{id}")
    // public Projeto atualizarProjeto(@PathVariable Long id, @RequestBody Projeto projeto) {
    //     return service.atualizarProjeto(id, projeto);
    // }

    // @DeleteMapping("/{id}")
    // public void deletarProjeto(@PathVariable Long id) {
    //     service.deletarProjeto(id);
    // }

    // @GetMapping("/{id}/calcular-custo")
    // public double calcularCustoDoProjeto(@PathVariable Long id) {
    //     return service.calcularCustoDoProjeto(id);
    // }

    // @Override
    // @GetMapping
    // public ResponseEntity<?> listarProjetos() {
    //     return service.listarProjetos();
    // }
}
