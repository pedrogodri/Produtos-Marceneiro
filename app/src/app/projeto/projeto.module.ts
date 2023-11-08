import { FormsModule } from '@angular/forms';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ListaProjetoComponent } from './templates/lista-projeto/lista-projeto.component';
import { BrowserModule } from '@angular/platform-browser';
import { CadastroProjetoComponent } from './templates/cadastro-projeto/cadastro-projeto.component';
import { CadastroSubprojetoComponent } from './templates/cadastro-subprojeto/cadastro-subprojeto.component';



@NgModule({
  declarations: [
    ListaProjetoComponent,
    CadastroProjetoComponent,
    CadastroSubprojetoComponent
  ],
  imports: [
    CommonModule,
    FormsModule,
    BrowserModule
  ],
  exports: [
    ListaProjetoComponent,
    CadastroProjetoComponent
  ]
})
export class ProjetoModule { }
