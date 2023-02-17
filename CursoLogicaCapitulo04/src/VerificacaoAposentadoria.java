import java.util.*;
public class VerificacaoAposentadoria {
	
	static final Integer idadeAposentadoria = 55;
	static final Integer anosTrabalhados = 25;

	public static void main(String[] args) {
		
		Scanner leitorDados = new Scanner(System.in);
		
		Integer tempoContribuicao = 0;
		Integer idadeFuncionario = 0;
		
		
		System.out.print("Idade: ");
		idadeFuncionario = leitorDados.nextInt();
		
		System.out.print("Tempo de Contribuiçao (Anos): ");
		tempoContribuicao = leitorDados.nextInt();
		
		Boolean podeAposentar = idadeFuncionario >= idadeAposentadoria && tempoContribuicao >= anosTrabalhados;

		if (podeAposentar) {
			
			System.out.println("Você pode se aposentar!");
		} else {
			
			System.out.println("Você ainda não pode se aposentar!");
			
		}
		
		
	}

} //resolucao prof https://github.com/algaworks/curso-logica-de-programacao-com-java/blob/master/04.09-exercicio/CursoLogicaCapitulo04/src/Exercicio04.java
