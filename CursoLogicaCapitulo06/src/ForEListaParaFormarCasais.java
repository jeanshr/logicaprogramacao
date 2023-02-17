
public class ForEListaParaFormarCasais {

	public static void main(String[] args) {
		
		String[] listaMulheres = new String[] {"Capitã Marvel", "Sansa", "Maria do Bairro"};
		String[] listaHomens = new String[] {"Jaime", "Thor", "Chris"};
		
		System.out.println("DUPLAS!");
		System.out.println();
		
		Integer contadorListas = 0;
		
		for(int i = 0; i < listaMulheres.length; i++) {
			String armazenaNomeMulheresLista = listaMulheres[i];
			contadorListas = i + 1;
			System.out.println("Mulher " + contadorListas + ": " + armazenaNomeMulheresLista);
		}
		
		System.out.println();
		
		for(int j = 0; j < listaHomens.length; j++) {
			String armazenaNomeHomensLista = listaHomens[j];
			contadorListas = j + 1;
			System.out.println("Homem " + contadorListas + ": " + armazenaNomeHomensLista);
		}
		
		System.out.println();
		
		for(int x = 0; x < 3; x++) {
			String mulherParaFormarDupla = listaMulheres[x];
			String homemParaFormarDupla = listaHomens[x];
			System.out.println("Dupla: " + mulherParaFormarDupla + " e " + homemParaFormarDupla);
			
		}
	}

}
//lista https://medium.com/reflex%C3%A3o-computacional/8-exerc%C3%ADcios-for-980e5f35478