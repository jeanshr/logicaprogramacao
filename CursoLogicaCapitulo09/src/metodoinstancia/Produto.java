package metodoinstancia;

import metodoinstancia.Produto;

public class Produto {

	String nome;
	Double precoUnitario;
	Integer quantidade;
	Integer QUANTIDADE_MINIMA_ESTOQUE  = 10;

	Boolean validarQuantidadeProdutosEmEstoque() {
		Boolean quantidadeMinimaProdutosEmEstoque = quantidade < QUANTIDADE_MINIMA_ESTOQUE;
		
		if(quantidadeMinimaProdutosEmEstoque) {
			return true;
		}
		
		return quantidadeMinimaProdutosEmEstoque;
	}
}