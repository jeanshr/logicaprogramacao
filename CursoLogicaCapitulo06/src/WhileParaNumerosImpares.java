
public class WhileParaNumerosImpares {
	
	static final Integer calculaImpar = 2;

	public static void main(String[] args) {
		Integer[] listaImpar = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		
		int i = 0;
		
		while(i < listaImpar.length) {
			Integer pegadorDoNumeroAtualLista = listaImpar [i];
			Integer validaSeImpar = pegadorDoNumeroAtualLista % calculaImpar;
			
			if(validaSeImpar != 0) {
				System.out.println("Número: " + pegadorDoNumeroAtualLista + ", é impar!");
				i++;
			}
			i++;
		}

	}

}
