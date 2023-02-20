package bibliotecapropria;

import console.Interacao;

public class BibliotecaPropria {

	public static void main(String[] args) {
		Interacao interacao = new Interacao();
		
		Integer numero = interacao.lerNumero("Digite um número: ");
		interacao.imprimir("Número: " + numero);
		
		Double decimal = interacao.lerDecimal("Digite um número: ");
		interacao.imprimir("Número decimal: " + decimal);
		
		interacao.erro("Msg de erro!");
		
		interacao.fechar();
	}

}

//video de apoio https://www.youtube.com/watch?v=GBzwSf8bEdQ