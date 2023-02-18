import java.util.Scanner;

public class EscolhendoBonsNomesParaMetodos {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		imprimirTraco();
		
		String cursoEscolhido = receberCursoUsuario(scanner);
		
		imprimirTraco();
		
		String formaPagamentoEscolhida = receberFormaPagamentoDoUsuario(scanner);

		imprimirTraco();

		imprimirMensagemComQuebraDeLinha("O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento é " + formaPagamentoEscolhida);

		scanner.close();
	}
	
	//Métodos
	
	static String receberFormaPagamentoDoUsuario(Scanner scanner) {
		String[] formasPagamento = new String[] {"Cartão", "Boleto"};
		
		iterarEExibirPosicoesDoVetorString(formasPagamento);
		
		Integer posicaoFormaPagamentoEscolhida = receberIndiceValidoDoUsuario(formasPagamento, "Escolha dentre as formas de pagamento abaixo: ", scanner);
		
		return formasPagamento[posicaoFormaPagamentoEscolhida];
	}
	static String receberCursoUsuario(Scanner scanner) {
		String[] cursos = new String[] {"Java EE", "Spring", "Java OO Avançado"};
		
		iterarEExibirPosicoesDoVetorString(cursos);
		
		Integer posicaoCursoEscolhido = receberIndiceValidoDoUsuario(cursos, "Escolha dentre os cursos abaixo: ", scanner);
		return cursos[posicaoCursoEscolhido];
	}
	
	static Integer receberIndiceValidoDoUsuario(String[] vetor, String texto, Scanner scanner) {
		Integer posicaoEscolhida = receberNumeroInteiroDoUsuario(texto, scanner);

		Boolean posicaoValida = verificarPosicaoEscolhidaPeloUsuario(posicaoEscolhida, vetor );

		if (!posicaoValida) {
			encerrarProgramaPorCausaDePosicaoInvalida();
		}
		return posicaoEscolhida;
	}

	static void imprimirTraco() {
		System.out.println("------------------------------------------------");
	}

	static void imprimirMensagemSemQuebraDeLinha(String texto) {
		System.out.print(texto);
	}
	static void imprimirMensagemComQuebraDeLinha(String texto) {
		System.out.println(texto);
	}

	static void encerrarProgramaPorCausaDePosicaoInvalida() {
		imprimirMensagemComQuebraDeLinha("Posição inválida!");
		System.exit(1);
	}

	static void iterarEExibirPosicoesDoVetorString(String[] vetor) {
		iterarEExibirPosicoesDoVetorString(vetor, 0);
	}
	
	//Testando iteração com recursividade
	static void iterarEExibirPosicoesDoVetorString(String[] vetor, Integer i) {
		imprimirMensagemComQuebraDeLinha("[" + i + "] " + vetor[i]);
		if(++i < vetor.length) {
			iterarEExibirPosicoesDoVetorString(vetor, i);
		}
		
	}

	static Boolean verificarPosicaoEscolhidaPeloUsuario(Integer posicao, String[] vetor) {
		Boolean valida = posicao >= 0 && posicao < vetor.length;
		return valida;
	}
	
	static Integer receberNumeroInteiroDoUsuario(String texto, Scanner scanner) {
		imprimirMensagemSemQuebraDeLinha(texto);
		Integer numero = scanner.nextInt();
		return numero;
	}

}//código professor https://github.com/algaworks/curso-logica-de-programacao-com-java/blob/ad39e5faaae366c1ddbd55b750b397e39c4858b7/08.10-escolhendo-bons-nomes/CursoLogicaCapitulo08/src/EscolhendoBonsNomes.java#L35
