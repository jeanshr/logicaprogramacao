package primeiraclasse;

public class PrimeiraClasse {

	public static void main(String[] args) {
		Produto instanciaProduto = new Produto();
		instanciaProduto.nome = "Smartphone";
		instanciaProduto.precoUnitario = 500.00;
		instanciaProduto.quantidade = 15;

		exibirQuantidadeEmEstoque(instanciaProduto);
	}

	static void exibirQuantidadeEmEstoque(Produto dadosProduto) {
		System.out.println("Quantidade de " + dadosProduto.nome 
				+ " em estoque é de: " + dadosProduto.quantidade 
				+ ", custando R$" + dadosProduto.precoUnitario + " a unidade!");
	}
}
