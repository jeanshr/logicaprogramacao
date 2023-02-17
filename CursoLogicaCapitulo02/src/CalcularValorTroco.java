import java.util.Scanner;

public class CalcularValorTroco {

	public static void main(String[] args) {
		
		//Instanciando um objeto Scanner para ler os dados do teclado
		Scanner scanner = new Scanner(System.in);
		
		//solicitando entrada de dados
		System.out.print("Digite o valor do produto: ");
		
		//declarando uma variável, e lendo com o objeto anteriormente instanciado
		Double valorProduto = scanner.nextDouble();
		
		//solicitando entrada de dados
		System.out.print("Digite o valor pago: ");
		
		//declarando uma variável, e lendo com o objeto anteriormente instanciado
		Double valorPassadoPeloCliente = scanner.nextDouble();		
		Double resultado = valorPassadoPeloCliente - valorProduto;
		
		//imprimindo resultado na tela
		System.out.println("Troco: " + resultado);
		
		//Fechando a conexão de leitura do scanner
		scanner.close();
		
	}

}
