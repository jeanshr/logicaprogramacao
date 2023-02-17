import java.util.*;
public class ForParaFazerSubtracoes {

	public static void main(String[] args) {
		
		Scanner leitorDados = new Scanner(System.in);
		
		System.out.println("Operação - Subtração!");
		
		for(int i = 1; i <= 3; i++) {	
			System.out.println();
			System.out.println("=======================");
			System.out.println();
			
			System.out.println("Conta " + i + "!");
			System.out.println();
			
			System.out.print("Digite um número: ");
			Integer primeiroNumero = leitorDados.nextInt();
			System.out.print("Digite outro número: ");
			Integer segundoNumero = leitorDados.nextInt();
			System.out.println();
			
			Integer resultadoSubtracao = primeiroNumero - segundoNumero;
			System.out.println(primeiroNumero + " - " + segundoNumero + " = " + resultadoSubtracao);
			
		}

	}

}
/*
 *  Faça um programa, utilizando for, que permita o usuário fazer três contas de subtração.
 */

//lista https://medium.com/reflex%C3%A3o-computacional/8-exerc%C3%ADcios-for-980e5f35478
