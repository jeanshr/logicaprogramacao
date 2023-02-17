import java.util.Scanner;

public class AlterandoValorVariavel {

	public static void main(String[] args) {
		Scanner leitorDados = new Scanner(System.in);
		
		System.out.print("Valor do Produto: ");
		Double valorProduto = leitorDados.nextDouble();
		
		System.out.print("Tipo Pagamento [1-A Vista / 2-A Prazo]: ");
		Integer tipoPagamento = leitorDados.nextInt();
		
		Boolean pagamentoAVista = tipoPagamento.equals(1); //tipo pagamento = 1?
		
		Double juros = 0.0;
		
		if (!pagamentoAVista) {
			
			juros = 10.00;
			
		}
		
		Double acrescimo = (valorProduto * juros) / 100;
		Double valorTotal = acrescimo + valorProduto;
		
		System.out.println("Total R$: " + valorTotal);
		
		leitorDados.close();

	}

}
