import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ListaProdutoComponent } from './produto/templates/lista-produto/lista-produto.component';
import { CadastroProdutoComponent } from './produto/templates/cadastro-produto/cadastro-produto.component';

const routes: Routes = [
  { path: 'lista-produto', component: ListaProdutoComponent },
  { path: 'cadastro-produto', component: CadastroProdutoComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
