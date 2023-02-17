
public class WhileParaFormarCasais {

	public static void main(String[] args) {
		String[] listaMulheres = new String[] {"Capitã Marvel", "Sansa", "Maria do Bairro"};
		String[] listaHomens = new String[] {"Jaime", "Thor", "Chris"};
		
		System.out.println("DUPLAS! ");
		System.out.println();
		
		Integer enquantoListaMulheres = 0;
		Integer enquantoListaHomens = 0;
		Integer contadorListas = 0;
		Integer enquantoFormarCasais = 0;
		
		while(enquantoListaMulheres < listaMulheres.length) {
			contadorListas = enquantoListaMulheres + 1;
			String leitorListaMulheres = listaMulheres[enquantoListaMulheres];
			System.out.println("Mulher " + contadorListas + ": " + leitorListaMulheres);
			enquantoListaMulheres++;
		}
		enquantoListaMulheres++;
		
		System.out.println();
		
		while(enquantoListaHomens < listaHomens.length) {
			contadorListas = enquantoListaHomens + 1;
			String leitorListaHomens = listaHomens[enquantoListaHomens];
			System.out.println("Homem " + contadorListas + ": " + leitorListaHomens);
			enquantoListaHomens++;
		}
		enquantoListaHomens++;
		
		System.out.println();
		
		while(enquantoFormarCasais < listaHomens.length) {
			contadorListas = enquantoFormarCasais + 1;
			String formadorCasalHomens = listaHomens[enquantoFormarCasais];
			String formadorCasalMulheres = listaMulheres[enquantoFormarCasais];
			System.out.println("Dupla: " + formadorCasalMulheres + " e " + formadorCasalHomens);
			enquantoFormarCasais++;
		}
		enquantoFormarCasais++;
	}

}
