import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Projeto } from 'src/app/model/projeto/projeto';
import { ProjetoService } from 'src/app/services/projeto/projeto.service';

@Component({
  selector: 'app-lista-projeto',
  templateUrl: './lista-projeto.component.html',
  styleUrls: ['./lista-projeto.component.scss']
})
export class ListaProjetoComponent implements OnInit {
  projetos: Projeto[] = [];

  constructor(private service: ProjetoService, private router: Router) { }

  ngOnInit(): void {
    this.service.listarProjeto().subscribe(
      response => {
        this.projetos = response
        console.log(this.projetos)
      }
    )
  }

  novoCadastroProjeto(): void {
    this.router.navigate(['cadastro-projeto'])
  }

  addSubprojeto(id: number): void {
    this.service.setProjetoId(id);
    this.router.navigate([`cadastro-subprojeto/${id}`]);
  }
}
