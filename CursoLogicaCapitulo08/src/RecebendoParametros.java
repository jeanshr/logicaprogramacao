import java.util.Scanner;

public class RecebendoParametros {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		imprimirTraco();

		String[] cursos = new String[] {"Java EE", "Spring", "Java OO Avançado"};	

		imprimirMensagemSemQuebraDeLinha("Escolha dentre os cursos abaixo: ");

		iterarEExibirPosicoesDoVetorString(cursos);

		imprimirMensagemSemQuebraDeLinha("O curso que você deseja é o: ");
		Integer posicaoCursoEscolhido = scanner.nextInt();

		Boolean posicaoValida = posicaoCursoEscolhido >= 0 && posicaoCursoEscolhido < cursos.length; 

		if (!posicaoValida) {
			encerrarProgramaPorCausaDePosicaoInvalida();
		}

		imprimirTraco();

		String[] formasPagamento = new String[] {"Cartão", "Boleto"};

		imprimirMensagemComQuebraDeLinha("Escolha dentre as formas de pagamento abaixo: ");

		iterarEExibirPosicoesDoVetorString(formasPagamento);

		imprimirMensagemSemQuebraDeLinha("Sua forma de pagamento escolhida é: ");
		Integer posicaoFormaPagamentoEscolhida = scanner.nextInt();

		posicaoValida = posicaoFormaPagamentoEscolhida >= 0 
				&& posicaoFormaPagamentoEscolhida < formasPagamento.length; 

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
		System.err.println("Posição inválida!");
		System.exit(1);
	}
	
	static void iterarEExibirPosicoesDoVetorString(String[] vetor) {
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("[" + i + "] " + vetor[i]);
		}
	}

}
