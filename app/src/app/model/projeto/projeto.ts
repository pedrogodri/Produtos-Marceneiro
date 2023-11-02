import { Produto } from "../produto/produto";

export class Projeto {
  id?: number;
  nome?: string;
  quantidadeMetrosCubicos: number = 0;
  produto: Produto = new Produto();
  custoTotal?: number;

  // public calcularCustoTotal(): void {
  //   if (this.produto !== null) {
  //     this.custoTotal = this.quantidadeMetrosCubicos * (this.produto.custoMadeiraPorMetroCubico + this.produto.quantidadePregoPorMetroCubico);
  //   }
  // }
}
