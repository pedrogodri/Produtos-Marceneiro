import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Projeto } from 'src/app/model/projeto/projeto';

@Injectable({
  providedIn: 'root'
})
export class ProjetoService {

  private idProjeto:number = 0;

  constructor(private http: HttpClient) { }

  private url:string = 'http://localhost:8080/projetos';

  cadastrarProjeto(projeto: Projeto): Observable<Projeto> {
    return this.http.post<Projeto>(this.url, projeto);
  }

  cadastrarSubprojeto(id: number, subprojeto: Projeto): Observable<Projeto> {
    return this.http.post<Projeto>(`${this.url}/${id}/subprojetos`, subprojeto);
  }

  listarProjeto(): Observable<Projeto[]> {
    return this.http.get<Projeto[]>(this.url);
  }

  setProjetoId(id: number) {
    this.idProjeto = id;
  }

  getProjetoId(): number {
    return this.idProjeto;
  }
}
