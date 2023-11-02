import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ListaProdutoComponent } from './templates/lista-produto/lista-produto.component';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';
import { CadastroProdutoComponent } from './templates/cadastro-produto/cadastro-produto.component';



@NgModule({
  declarations: [
    ListaProdutoComponent,
    CadastroProdutoComponent
  ],
  imports: [
    CommonModule,
    FormsModule,
    BrowserModule
  ],
  exports: [
    ListaProdutoComponent,
    CadastroProdutoComponent  
  ]
})
export class ProdutoModule { }
