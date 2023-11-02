import { Produto } from './../../model/produto/produto';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ProdutoService {

  constructor(private http: HttpClient) { }

  private url:string = 'http://localhost:8080/produtos';

  cadastrarProduto(produto: Produto): Observable<Produto> {
    return this.http.post<Produto>(this.url, produto);
  }

  listarProduto(): Observable<Produto[]> {
    return this.http.get<Produto[]>(this.url);
  }
}
