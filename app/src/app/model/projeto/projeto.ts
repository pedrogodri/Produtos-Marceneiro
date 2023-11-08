import { Produto } from "../produto/produto";

export class Projeto {
  id: number = 0;
  nome?: string;
  quantidadeMetrosCubicos?: number;
  produto?: Produto;
  subprojetos?: Projeto[];
  custoTotal?: number;
}
