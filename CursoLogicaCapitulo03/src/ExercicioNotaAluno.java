import java.util.Scanner;

public class ExercicioNotaAluno {

	public static void main(String[] args) {
	
		Scanner leitorDados = new Scanner(System.in);
		
		System.out.println("Nota: ");
		Integer nota = leitorDados.nextInt();
		
		Boolean validarNota = nota > 70;
		
		if (validarNota) {
			System.out.println("Parabéns, vc passou!");
		} else {

			System.out.println("Infelizmente vc não passou!");
		}
		
		leitorDados.close();

	}

}

/*
 * O seu programa deve receber a nota do aluno pelo console e depois você vai fazer uma operação lógica para saber se a nota do aluno é maior que 70. O resultado dessa operação lógica deve ser atribuido a uma variável do tipo Boolean.

Por último, você deve utilizar a variável do tipo Boolean com a estrutura de decisão if para imprimir, no console, uma mensagem que vai dizer se o aluno passou ou não passou.
*/

//codigo do professor https://github.com/algaworks/curso-logica-de-programacao-com-java/blob/master/03.08-exercicio/CursoLogicaCapitulo03/src/Exercicio03.java
