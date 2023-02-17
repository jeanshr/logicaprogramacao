import java.util.*;
public class ForParaCadastrarProdutos {

	public static void main(String[] args) {
		
		//EXERCICIO NÃO FINALIZADO
		
		Scanner leitorDados = new Scanner(System.in);
		
		System.out.println("CADASTRO DE PRODUTOS!");
		System.out.println();
		
		System.out.print("Qtos produtos vamos cadastrar?: ");
		Integer qtdeProdutosCadastro = leitorDados.nextInt();
		System.out.println("Resposta: " + qtdeProdutosCadastro);
		System.out.println();
		System.out.println("================================");
		
		String[] produtosCadastrados = new String[] {};
		Double[] precosProdutosCadastros = new Double[] {};
		Integer contadorListas = 0;
		
		for(int i = 0; i < qtdeProdutosCadastro; i++) {
			contadorListas = i + 1;
			System.out.println("Produto " + contadorListas + ":");
		}
		
		leitorDados.close();

	}

}
