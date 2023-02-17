import java.util.*;
public class UtilizandoIfEncadeado {

	static final Integer pesoLeveCategoria = 60;
	static final Integer pesoMedioCategoria = 90;
	static final Integer pesoPesadoCategoria = 91;
	
	public static void main(String[] args) {
		Scanner leitorDados = new Scanner(System.in);
		
		System.out.println("Entre com seu peso: ");
		Double peso = leitorDados.nextDouble();

		Boolean pesoLeve = (peso <= pesoLeveCategoria) && (peso > 0);
		Boolean pesoMedio = (peso > pesoLeveCategoria) && (peso <= pesoMedioCategoria);
		Boolean pesoPesado = peso >= pesoPesadoCategoria;
		
		/* Usando if encadeado
		 * 
		 * if (pesoLeve) {
			
			System.out.println("Ele é peso leve!");
			
		} else {
			
			if (pesoMedio) {
				System.out.println("Ele é peso médio!");
			}
			
			if (pesoPesado) {
				System.out.println("Ele é peso pesado!");
			}			
		}
		*/
		
		//Usando else if
		
		 if (pesoLeve) {
				System.out.println("Ele é peso leve!");	
			} 
		 else if (pesoMedio) {
					System.out.println("Ele é peso médio!");
				}
		 else if (pesoPesado) {
				System.out.println("Ele é peso pesado!");
			}
		 
		 else {
			 System.out.print("Lutador sem categoria");
		 }
			 
		 leitorDados.close();

	}

}
