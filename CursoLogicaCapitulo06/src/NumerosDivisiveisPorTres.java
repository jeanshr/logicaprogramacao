
public class NumerosDivisiveisPorTres {
	
	static final Integer divisor = 3;

	public static void main(String[] args) {
		
		Integer[] numeros = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		
		for(int i = 0; i < numeros.length; i++) {
			
			Integer eDivisivel = numeros[i] % divisor;
			//System.out.println("Dividendo " + i +  ", " + eDivisivel);
			
			if(eDivisivel.equals(0)) {
				Integer numerosDivisiveis = numeros[i];
				System.out.println("Número: " + numerosDivisiveis + ", é divisível por 3.");
			}
			
		}
		System.out.println("fim do for!");

	}

}
/*
 * Dada a lista de números abaixo:

Integer[] numeros = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

... Itere por essa lista e imprima todos os números que são divisíveis por 3.

Para descobrir se um número é divisível por 3, você pode utilizar o operador módulo. Toda vez que o módulo de um número por 3 for igual a zero, então esse número e divisível por 3.
 */

// soluçao https://github.com/algaworks/curso-logica-de-programacao-com-java/blob/master/06.03-exercicio/CursoLogicaCapitulo06/src/Exercicio01.java