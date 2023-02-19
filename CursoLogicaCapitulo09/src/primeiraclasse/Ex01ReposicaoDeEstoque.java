package primeiraclasse;

public class Ex01ReposicaoDeEstoque {

	public static void main(String[] args) {
		Produto acessandoObjetoProduto = new Produto();
		acessandoObjetoProduto.nome = "Macbook Pro";
		acessandoObjetoProduto.quantidade = -1;

		validarQuantidadeProdutosEmEstoque(acessandoObjetoProduto);
	}
	
	static void validarQuantidadeProdutosEmEstoque(Produto quantidadeProdutosEmEstoque) {
		Boolean quantidadeMinimaProdutosEmEstoque = quantidadeProdutosEmEstoque.quantidade >= Produto.QUANTIDADE_MINIMA_ESTOQUE;
		
		if (quantidadeMinimaProdutosEmEstoque){
			System.out.println("Estoque de " + quantidadeProdutosEmEstoque.nome 
					+ " está controlada! Total em Estoque " + quantidadeProdutosEmEstoque.quantidade);
		}
		else if(!quantidadeMinimaProdutosEmEstoque && quantidadeProdutosEmEstoque.quantidade > 0) {
			System.out.println("Resta(m) " + quantidadeProdutosEmEstoque.quantidade 
					+ " unidade(s) do produto " + quantidadeProdutosEmEstoque.nome 
					+ ". Precisamos de reposição imediata!");;
		} else {
			System.out.println("Estoque de " + quantidadeProdutosEmEstoque.nome + " totalmente zerada!!!");
		}
		//solução professor https://github.com/algaworks/curso-logica-de-programacao-com-java/blob/master/09.03-exercicio/CursoLogicaCapitulo09/src/exercicio01/Exercicio01.java
	}

}
