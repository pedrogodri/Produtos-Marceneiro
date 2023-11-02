import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ListaProdutoComponent } from './produto/templates/lista-produto/lista-produto.component';
import { CadastroProdutoComponent } from './produto/templates/cadastro-produto/cadastro-produto.component';
import { ListaProjetoComponent } from './projeto/templates/lista-projeto/lista-projeto.component';
import { CadastroProjetoComponent } from './projeto/templates/cadastro-projeto/cadastro-projeto.component';

const routes: Routes = [
  { path: '', redirectTo: 'lista-projeto', pathMatch: 'full' },
  { path: 'lista-produto', component: ListaProdutoComponent },
  { path: 'cadastro-produto', component: CadastroProdutoComponent },
  { path: 'lista-projeto', component: ListaProjetoComponent },
  { path: 'cadastro-projeto', component: CadastroProjetoComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
