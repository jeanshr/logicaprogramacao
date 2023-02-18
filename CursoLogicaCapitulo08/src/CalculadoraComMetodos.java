import java.util.*;
public class CalculadoraComMetodos {

	public static void main(String[] args) {
		//leitor dos dados do teclado
		Scanner leitorDados = new Scanner(System.in);

		//lista de operaçoes possíveis nesta calculadora
		String[] vetorOperacoesMatematicas = new String[] { "Adição", "Subtração", "Multiplicação", "Divisão", "Módulo"};

		imprimirTextos("Operações disponíveis: ");
		imprimirTextos("");
		
		//lendo e imprindo valores do vetor
		for(int i = 0; i < vetorOperacoesMatematicas.length; i++) {
			String posicaoOperacoes = vetorOperacoesMatematicas[i];
			Integer contadorPosicao = i + 1;
			imprimirTextos("[" + contadorPosicao + "]" + " " + posicaoOperacoes);
		}
		//quebra de linha
		imprimirTextos("");

		//Recebendo operação escolhida
		Double recebeNumeroOperacao = receberNumeroUsuario("Escolha sua operação: ", leitorDados);

		//validar se o número de operação recebido é válido
		Boolean operacaoValida = recebeNumeroOperacao <= vetorOperacoesMatematicas.length;

		if(!operacaoValida) {
			mensagemErros("Opção inválida");
		} 	

		//apenas pulando de linha para ficar visualmente mais bonito no console
		imprimirTextos("");

		//variáveis que irão receber os numeros de entrada do teclado
		Double primeiroNumero = receberNumeroUsuario("Entre com o primeiro Numero: ", leitorDados);
		Double segundoNumero = receberNumeroUsuario("Entre com o segundo Numero: ", leitorDados);

		if(recebeNumeroOperacao.equals(1.0)) {
			imprimirTextos("Resultado: " + calcularAdicao(primeiroNumero, segundoNumero));
		} else if(recebeNumeroOperacao.equals(2.0)) {
			imprimirTextos("Resultado: " + calcularSubtracao(primeiroNumero, segundoNumero));
		}else if(recebeNumeroOperacao.equals(3.0)) {
			imprimirTextos("Resultado: " + calcularMultiplicacao(primeiroNumero, segundoNumero));
		}else if(recebeNumeroOperacao.equals(4.0)) {
			imprimirTextos("Resultado: " + calcularDivisao(primeiroNumero, segundoNumero));
		}else if(recebeNumeroOperacao.equals(5.0)) {
			imprimirTextos("Resultado: " + calcularModulo(primeiroNumero, segundoNumero));
		}
		
		//fechando conexão
		leitorDados.close();
	}

		//Métodos
	
	static void mensagemErros(String texto) {
		System.err.println(texto);
		System.exit(1);
	}

	static String imprimirTextos(String texto) {
		System.out.println(texto);
		return texto;
	}
	static Double receberNumeroUsuario(String texto, Scanner leitorDados) {
		imprimirTextos(texto);
		Double numeroRecebido = leitorDados.nextDouble();
		return numeroRecebido;
	}

	static Double calcularAdicao(Double primeiroNumero, Double segundoNumero) {
		Double resultado = primeiroNumero + segundoNumero;
		//imprimirTextos("A soma de " + primeiroNumero + " + " + segundoNumero + " é: " + resultado);
		return resultado;
	}
	static Double calcularSubtracao(Double primeiroNumero, Double segundoNumero) {
		Double resultado = primeiroNumero - segundoNumero;
		return resultado;
	}
	static Double calcularMultiplicacao(Double primeiroNumero, Double segundoNumero) {
		Double resultado = primeiroNumero * segundoNumero;

		return resultado;
	}
	static Double calcularDivisao(Double primeiroNumero, Double segundoNumero) {
		Double resultado = primeiroNumero / segundoNumero;

		return resultado;
	}
	static Double calcularModulo(Double primeiroNumero, Double segundoNumero) {
		Double resultado = primeiroNumero % segundoNumero;

		return resultado;
	}
}
/*
 * TODO: Caso queira melhorar as entradas de dados, passar o método para Inteiro, assim não precisará entrar com 1.0, 2.0, e etc.
 * Porém, fazendo isso o programa não conseguirá fazer contas com decimais, apenas inteiros.
 * 
 * Solução professor https://github.com/algaworks/curso-logica-de-programacao-com-java/blob/master/08.07-exercicio/CursoLogicaCapitulo08/src/Exercicio03.java
 */
