import java.util.Scanner;

/*
 * Crie um programa que lê, do console, o nome e o sobrenome de uma pessoa e depois imprime o nome completo. Para isso, você vai precisar de duas variáveis: a primeira você pode chamar de "nome" e a segunda de "sobrenome". Por último, você vai juntar o nome e o sobrenome em uma única impressão.
 */

public class ExercicioLeitorNomes {
	
	public static void main(String[] args) {
		
		Scanner leitorDados = new Scanner(System.in);
		
		System.out.println("Por favor, digite seu nome: ");
		String nome = leitorDados.nextLine();
		
		System.out.println("Agora, entre com o sobrenome: ");
		String SobreNome = leitorDados.nextLine();
		
		System.out.println("Olá " + nome + " " + SobreNome + ", seja bem vindo!");
		
		leitorDados.close();
	}

}

//Código professor https://github.com/algaworks/curso-logica-de-programacao-com-java/tree/master/03.06-exercicio/CursoLogicaCapitulo03/src