
public class ForParaNumerosPares {
	
	static final Integer calculaPares = 2;

	public static void main(String[] args) {
		
		Integer[] listaParaValidar = new Integer [] {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		for(int i = 0; i < listaParaValidar.length; i++) {
			Integer eNumeroPar = listaParaValidar[i];
			if(eNumeroPar % calculaPares == 0) {
				Integer numerosPares = listaParaValidar[i];
				System.out.println("Número: " + numerosPares + " é par!");
			}
		}
		
	}

}

/*
 * Exercício 1:
Crie um algoritmo usando o for que leia uma lista. Mostre no console apenas os números pares. 
Esta lista deve ser assim: [1, 2, 3, 4, 5, 6, 7, 8, 9];
 */
