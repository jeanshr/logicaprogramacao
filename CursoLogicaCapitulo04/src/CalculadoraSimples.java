import java.util.Scanner;

public class CalculadoraSimples {

	public static void main(String[] args) {
		
		Scanner leitorDados = new Scanner(System.in);
		
		Double primeiroNumero = null;
		Double segundoNumero = null;
		Integer operacaoMatematica = null;
		Double resultado = null;
		
		System.out.print("Valor A: ");
		primeiroNumero = leitorDados.nextDouble();
		
		System.out.println("Operação [1 - Soma / 2 - Subtração / 3 - Multiplicação / 4 - Divisão: ");
		operacaoMatematica = leitorDados.nextInt();
		
		System.out.print("Valor B: ");
		segundoNumero = leitorDados.nextDouble();
		
		if (operacaoMatematica.equals(1)) {
			
			resultado = primeiroNumero + segundoNumero;
			
		} else if (operacaoMatematica.equals(2)) {
			
			resultado = primeiroNumero - segundoNumero;
			
		}
		 else if (operacaoMatematica.equals(3)) {
				
				resultado = primeiroNumero * segundoNumero;
				
			} else {
				
				resultado = primeiroNumero / segundoNumero;
				
			}
		
		
		System.out.print("Resultado: " + resultado);
		leitorDados.close();

	}

}
