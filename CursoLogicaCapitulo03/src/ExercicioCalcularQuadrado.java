import java.util.Scanner;

public class ExercicioCalcularQuadrado {

	public static void main(String[] args) {
		
		/*
		 * Leia um número no console e depois faça o cálculo do quadrado desse número e exiba o resultado no console. Lembrando que o quadrado de um número é calculado multiplicando-se o número por ele mesmo. Por exemplo, para encontrar o quadrado de 2 é preciso multiplicar o 2 por 2, tendo como resultado o número 4.
		 */
		
		Scanner leitorEntrada = new Scanner(System.in);
		
		System.out.println("Valor de Entrada: ");
		Double numeroCalcular = leitorEntrada.nextDouble();
		
		Double Quadrado = numeroCalcular * 2;
		
		System.out.println("O quadrado de " + numeroCalcular + " é " + Quadrado);

		leitorEntrada.close();
	}

}
/*
 * Resolução professor:
 * import java.util.Scanner;

public class Exercicio01 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe um número: ");
		Integer numero = scanner.nextInt();
		
		Integer quadrado = numero * numero;
		
		System.out.println("O quadrado de " + numero + " é " + quadrado + ".");
		
		scanner.close();
	}

}
 */
