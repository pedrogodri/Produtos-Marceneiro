import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { Produto } from 'src/app/model/produto/produto';
import { Projeto } from 'src/app/model/projeto/projeto';
import { ProdutoService } from 'src/app/services/produto/produto.service';
import { ProjetoService } from 'src/app/services/projeto/projeto.service';

@Component({
  selector: 'app-cadastro-subprojeto',
  templateUrl: './cadastro-subprojeto.component.html',
  styleUrls: ['./cadastro-subprojeto.component.scss']
})
export class CadastroSubprojetoComponent {
  projeto: Projeto;
  produtos: Produto[] = [];
  id: number = 0;

  constructor(private serviceProjeto: ProjetoService, private serviceProduto: ProdutoService, private router: Router) {
    this.projeto = new Projeto();
  }
  ngOnInit(): void {
    this.id = this.serviceProjeto.getProjetoId();

    this.serviceProduto.listarProduto().subscribe(
      response => {
        this.produtos = response;
      }
    )
  }

  onSubmit(): void {
    this.serviceProjeto.cadastrarSubprojeto(this.id, this.projeto).subscribe(
      response => {
        this.projeto = response;
        this.router.navigate(['lista-projeto'])
      },
    );
  }
}
