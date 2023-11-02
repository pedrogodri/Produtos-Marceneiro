import { Component, OnInit } from '@angular/core';
import { Produto } from 'src/app/model/produto/produto';
import { Projeto } from 'src/app/model/projeto/projeto';
import { ProdutoService } from 'src/app/services/produto/produto.service';
import { ProjetoService } from 'src/app/services/projeto/projeto.service';

@Component({
  selector: 'app-cadastro-projeto',
  templateUrl: './cadastro-projeto.component.html',
  styleUrls: ['./cadastro-projeto.component.scss']
})
export class CadastroProjetoComponent implements OnInit {
  projeto: Projeto;
  produtos: Produto[] = [];

  constructor(private serviceProjeto: ProjetoService, private serviceProduto: ProdutoService) {
    this.projeto = new Projeto();
  }
  ngOnInit(): void {
    this.serviceProduto.listarProduto().subscribe(
      response => {
        this.produtos = response;
      }
    )
  }

  onSubmit(): void {
    this.serviceProjeto.cadastrarProjeto(this.projeto).subscribe(
      response => {
        this.projeto = response;
        console.log(this.projeto);
      },
    );
  }
}
