import { Produto } from './../../../model/produto/produto';
import { Component } from '@angular/core';
import { ProdutoService } from 'src/app/services/produto/produto.service';

@Component({
  selector: 'app-cadastro-produto',
  templateUrl: './cadastro-produto.component.html',
  styleUrls: ['./cadastro-produto.component.scss']
})
export class CadastroProdutoComponent {
  produto: Produto;

  constructor(private service: ProdutoService) {
    this.produto = new Produto();
  }

  onSubmit(): void {
    this.service.cadastrarProduto(this.produto).subscribe(
      response => {
        this.produto = response;
        console.log(this.produto);
      },
    );
  }
}
