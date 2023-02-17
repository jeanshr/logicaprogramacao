
public class ForParaNumerosImpares {
	
	static final Integer calculaImpares = 2;
	
	public static void main(String[] args) {
		
		Integer[] listaImpar = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		
		for(int i = 0; i < listaImpar.length; i++) {
			Integer numeros = listaImpar[i];
			
			if(numeros % calculaImpares != 0) {
				Integer eImpar = numeros;
				System.out.println("Número: " + eImpar + ", é impar!");
			}
		}

	}

}
//lista https://medium.com/reflex%C3%A3o-computacional/8-exerc%C3%ADcios-for-980e5f35478