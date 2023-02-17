import java.util.Scanner;

public class DescontoFreteCompras {

		static final Integer valorFrete = 15;
	
	public static void main(String[] args) {
		
		Scanner leitorDados = new Scanner(System.in);
		
		Double valorProduto = null;
		Double valorFinal = null;
		
		System.out.print("Valor do Produto R$: ");
		valorProduto = leitorDados.nextDouble();
		
		if (valorProduto < 100) {
			
			valorFinal = valorProduto + valorFrete;
		}else {
			
			valorFinal = valorProduto;
			
		}
		
		System.out.print("Total a pagar R$: " + valorFinal);
			
		
		leitorDados.close();
	}

}

/*
 * Resolução professor
 * public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Valor do produto: ");
		Double valorProduto = scanner.nextDouble();
		
		Boolean precisaCobrarFrete = valorProduto < 100;
		
		Double valorFinal = valorProduto;
		
		if (precisaCobrarFrete) {
			valorFinal += 15.0;
		}
		
		System.out.println("Valor final: " + valorFinal);
		
		
		scanner.close();

	}
 */
