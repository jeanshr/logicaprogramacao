import java.util.Scanner;

public class RecursividadeAulaDois {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		imprimirTraco();

		String[] cursos = new String[] {"Java EE", "Spring", "Java OO Avançado"};	

		imprimirMensagemSemQuebraDeLinha("Escolha dentre os cursos abaixo: ");

		iterarEExibirPosicoesDoVetorString(cursos);

		Integer posicaoCursoEscolhido = receberNumeroInteiroDoUsuario("O curso que você deseja é o: ", scanner);

		Boolean posicaoValida = verificarPosicaoEscolhidaPeloUsuario(posicaoCursoEscolhido, cursos );

		if (!posicaoValida) {
			encerrarProgramaPorCausaDePosicaoInvalida();
		}

		imprimirTraco();

		String[] formasPagamento = new String[] {"Cartão", "Boleto"};

		imprimirMensagemComQuebraDeLinha("Escolha dentre as formas de pagamento abaixo: ");

		iterarEExibirPosicoesDoVetorString(formasPagamento);

		Integer posicaoFormaPagamentoEscolhida = receberNumeroInteiroDoUsuario("Sua forma de pagamento escolhida é: ", scanner);

		posicaoValida = verificarPosicaoEscolhidaPeloUsuario(posicaoFormaPagamentoEscolhida, cursos );

		if (!posicaoValida) {
			encerrarProgramaPorCausaDePosicaoInvalida();
		}

		String cursoEscolhido = cursos[posicaoCursoEscolhido];
		String formaPagamentoEscolhida = formasPagamento[posicaoFormaPagamentoEscolhida];

		imprimirTraco();

		imprimirMensagemComQuebraDeLinha("O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento é " + formaPagamentoEscolhida);

		scanner.close();
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

}
