import java.util.*;
public class Vetores1D {

	public static void main(String[] args) {
		// Lendo um vetor/array pré-definido e imprimindo/escolhendo com base nos dados ja existentes
		//		
		Scanner scan = new Scanner(System.in);
		//		
		//		String[] cardapio = new String[] {"Calabresa", "Atum", "Queijo", "Presunto"};
		//		
		//		for(int i = 0; i < cardapio.length; i++) {
		//			Integer contador = i+1;
		//			System.out.println("[" + contador + "]" + cardapio[i]);
		//		}
		//		System.out.println();
		//		System.out.println("====================");
		//		System.out.println();
		//		System.out.println("Escolha o sabor: ");
		//		Integer escolhaCliente = scan.nextInt();
		//		System.out.println("====================");
		//		System.out.println();
		//		System.out.println("Sua escolha foi: " + cardapio[escolhaCliente]);
		//		
		//		scan.close();

		//Adicionando novos dados no array
		//		String[] cardapio = new String[] {"Calabresa", "Atum", "Queijo", "Presunto"};
		//		
		//		cardapio[3] = "Frango";
		//		
		//		for(int i = 0; i < cardapio.length; i++) {
		//		System.out.println(cardapio[i]);
		//		}

		// Criando vetor vazio, e adicionando dados dentro dela

		String[] cardapio = new String[4];
		String nomeParaVetor = null;

		for(int i = 0; i < cardapio.length; i++) {
			nomeParaVetor = scan.next();
			cardapio[i] = nomeParaVetor;
		}

		//soluçao sugerida em https://www.freecodecamp.org/news/java-array-methods-how-to-print-an-array-in-java/
		for(int j = 0; j < cardapio.length; j++) {
			System.out.println(cardapio[j]);
		}

	}

}
