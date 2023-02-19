package classeinstancia;

public class ClasseInstancia {

	public static void main(String[] args) {
		Produto produto = new Produto();
		produto.nome = "Caneca";
		
		Produto produto2 = new Produto();
		produto2.nome = "Carteira";
		
		System.out.println("Produto 1: " + produto.nome
				+ "\nProduto 2: " + produto2.nome);

	}

}
