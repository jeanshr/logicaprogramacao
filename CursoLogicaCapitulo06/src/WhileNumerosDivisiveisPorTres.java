
public class WhileNumerosDivisiveisPorTres {
	
	static final Integer moduloTres = 3;

	public static void main(String[] args) {
		
		Integer[] numeros = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		
		int i = 0;
		while(i < numeros.length) {
			
			Integer leitorDaLista = numeros[i];
			Integer verificaPossibilidadeDivisaoPorTres = leitorDaLista % moduloTres;
			
			if(verificaPossibilidadeDivisaoPorTres.equals(0)) {
				System.out.println("Número: " + leitorDaLista + ", é divisível por " + moduloTres);
				i++;
			}
			//incrementando o i para casos que não entrem no if, se não ficará em looping.
			i++;
		}

	}

} //soluçao https://github.com/algaworks/curso-logica-de-programacao-com-java/blob/master/06.05-exercicio/CursoLogicaCapitulo06/src/Exercicio02.java
/*
 * Dada a lista de números abaixo:

Integer[] numeros = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

... Itere por essa lista e imprima todos os números que são divisíveis por 3.

Para descobrir se um número é divisível por 3, você pode utilizar o operador módulo. 
Toda vez que o módulo de um número por 3 for igual a zero, então esse número e divisível por 3.
 */