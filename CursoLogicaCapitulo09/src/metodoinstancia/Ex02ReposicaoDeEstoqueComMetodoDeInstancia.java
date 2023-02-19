package metodoinstancia;

public class Ex02ReposicaoDeEstoqueComMetodoDeInstancia {

	public static void main(String[] args) {
		Produto acessandoObjetoProduto = new Produto();
		acessandoObjetoProduto.nome = "Macbook Pro";
		acessandoObjetoProduto.quantidade = 10;

		System.out.println("O estoque do produto " +  acessandoObjetoProduto.nome + ", precisa de reposição?: " + acessandoObjetoProduto.validarQuantidadeProdutosEmEstoque());
	}
	
}
