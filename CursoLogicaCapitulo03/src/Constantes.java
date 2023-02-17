
public class Constantes {
	
	static final Integer idadeMinimaStatica = 18;

	public static void main(String[] args) {
		
		//final Integer idadeMinima = 18;
		Integer idade = 22;
		Boolean podeTirarCNH = idade >= idadeMinimaStatica;
		
		if (podeTirarCNH) {
			
			System.out.println("Pode sim!");
			
		} else {
			
			System.out.println("Pode não!");
			
		}

	}

}
