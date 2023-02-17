import java.util.*;
public class IteracaoFor {

	public static void main(String[] args) {
		
//		for (int i = 0; i < 5; i++) {
//			
//			System.out.println("Imprimir essa frase 5 vezes");
//			/*
//			 * 0 é menor que 5? sim
//			 * 1 é menor que 5? sim
//			 * 2 é menor que 5? sim
//			 * 3 é menor que 5? sim
//			 * 4 é menor que 5? sim
//			 * 5 é menor que 5? não -> não vai imprimir
//			 */
//		}
		//Até aqui nunca mexamos com array, este é apenas um exemplo
		
//		Double[] carrinhoCompras = new Double[] {50.0, 51.0, 52.0};
//		Double total = 0.0;
//		
//		for (int i = 0; i < carrinhoCompras.length; i++) {
//			
//			System.out.println("Posição da lista: " + i + ", Total R$: " + total);
//			 total += carrinhoCompras[i];
//		}
//		
//		System.out.println("Total R$: " + total);
		
		//misturando for com break e  if
//		
//		for(int i = 0; i < 10; i++) {
//			if(i == 5) {
		//System.out.println("Vai parar!");
//				break;
//			}
//			System.out.println("Iteração: " + i);
//		}
//		
//		for(int i = 0; i < 10; i++) {
//			if(i == 5) {
//				System.out.println("Vai continuar!");
//				continue;
//			}
//			
//			System.out.println("Iteração: " + i);
//		}
		
		//buscando dentro de um array
		
		Integer[] produtos = new Integer[] {100, 225, 300};
		
		for(int i = 0; i < produtos.length; i++) {
			Integer produto = produtos[i];
			System.out.println("Produto de código: " + produto);
			if(produto.equals(225)) {
				System.out.println("Produto encontrado!");
				break;
			}
		}

	}

}
