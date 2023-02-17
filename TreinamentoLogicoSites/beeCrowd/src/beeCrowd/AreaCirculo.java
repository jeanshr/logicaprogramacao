package beeCrowd;

import java.util.Scanner;

public class AreaCirculo {

	public static void main(String[] args) {
		// Exercício básico 1002

		Scanner leitorDados = new Scanner(System.in);
		
		Double n = 3.14159;
		
		Double raio = leitorDados.nextDouble();
		
		Double A = n * (raio * raio);
		System.out.printf("A=%.4f", A);
		
		leitorDados.close();
		
	}

}
