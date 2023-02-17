import java.util.Scanner;

public class CalculaIMC {

	public static void main(String[] args) {
		
		Scanner leitorDados = new Scanner(System.in);
		
		System.out.println("Qual seu peso atual?: ");
		Double Peso = leitorDados.nextDouble();
		
		System.out.println("Qual sua altura?: ");
		Double Altura = leitorDados.nextDouble();
		
		Double IMC = Peso / (Altura * Altura);
		
		System.out.println("Seu IMC é: " + IMC);
		
		leitorDados.close();
		
	}

}
