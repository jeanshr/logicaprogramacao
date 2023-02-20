package bibliotecapropria;
import console.Interacao;

public class CalcularValorTroco {

	public static void main(String[] args) {
		Interacao interacao = new Interacao();

		Double valorProduto = interacao.lerDecimal("Digite o valor do produto: ");
		Double valorPassadoPeloCliente = interacao.lerDecimal("Digite o valor pago: ");

		Double resultado = valorPassadoPeloCliente - valorProduto;

		interacao.imprimir("Troco: " + resultado);
		
		System.out.println(valorProduto);

		interacao.fechar();

	}

}
