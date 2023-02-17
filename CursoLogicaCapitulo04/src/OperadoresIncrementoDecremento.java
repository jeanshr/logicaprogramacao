
public class OperadoresIncrementoDecremento {

	public static void main(String[] args) {
		

		Integer numero = 10;
		
		System.out.println("Numero antes do incremento: " + numero);
		
		//operador de incremento
		numero++;
		
		System.out.println("Numero depois do incremento: " + numero);
		
		//operador de decremento
		numero--;
		System.out.println("Numero depois do decremento: " + numero);
		
		Integer i = 10;
		Integer j = i++;
		
		System.out.println("Valor de i: " + i + ", Valor de j: " + j);

	}

}
