package classeinstancia;

public class ClasseInstancia {

	public static void main(String[] args) {
		
		System.out.println("Qtde: " + Produto.quantidade_Minima_Estoque);
		
		Produto produto = new Produto();
		produto.nome = "Caneca";
		//produto.quantidade_Minima_Estoque = 10;
		Produto.quantidade_Minima_Estoque = 11;
		//System.out.println("Qtde: " + produto.quantidade_Minima_Estoque);
		System.out.println("Qtde: " + Produto.quantidade_Minima_Estoque);
		
		Produto produto2 = new Produto();
		produto2.nome = "Carteira";
		//System.out.println("Qtde: " + produto2.quantidade_Minima_Estoque);
		System.out.println("Qtde: " + Produto.quantidade_Minima_Estoque);
		
		System.out.println("Produto 1: " + produto.nome
				+ "\nProduto 2: " + produto2.nome);
		
		Impressao.informacao("Produto 1: " + produto.nome);
		Impressao.informacao("Produto 2: " + produto2.nome);

	}

}
