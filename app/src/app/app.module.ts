import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ComponentsModule } from './components/components.module';
import { ProdutoModule } from './produto/produto.module';
import { ProjetoModule } from './projeto/projeto.module';

@NgModule({
  declarations: [
    AppComponent,
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    BrowserModule,
    AppRoutingModule,
    ComponentsModule,
    ProdutoModule,
    ProjetoModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
