import java.util.Scanner;

public class CalculandoDesconto {

	public static void main(String[] args) {
		
		Scanner leitorDados = new Scanner(System.in);
		
		Double valorProduto;
		Double qtdeProduto;
		Double subTotal;
		
		System.out.print("Valor Produto: ");
		valorProduto = leitorDados.nextDouble();
		
		System.out.print("Qtde: ");
		qtdeProduto = leitorDados.nextDouble();
		
		subTotal = valorProduto * qtdeProduto;
		
		if (qtdeProduto > 10) {
			
			Double desconto = 10.00 / 100;
			subTotal = subTotal - (subTotal * desconto);
		} 
		
		System.out.print("Total a PAgar: " + subTotal);
		
		leitorDados.close();

	}

}
