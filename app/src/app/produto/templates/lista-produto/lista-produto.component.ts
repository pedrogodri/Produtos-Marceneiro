import { ProdutoService } from 'src/app/services/produto/produto.service';
import { Produto } from './../../../model/produto/produto';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-lista-produto',
  templateUrl: './lista-produto.component.html',
  styleUrls: ['./lista-produto.component.scss']
})
export class ListaProdutoComponent implements OnInit {
  produtos: Produto[] = [];

  constructor(private service: ProdutoService, private router: Router) { }

  ngOnInit(): void {
    this.service.listarProduto().subscribe(
      response => {
        this.produtos = response;
        console.log(this.produtos)
      }
    )
  }

  novoCadastroProduto(): void {
    this.router.navigate(['cadastro-produto'])
  }

}
