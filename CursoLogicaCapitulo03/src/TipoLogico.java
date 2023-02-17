
public class TipoLogico {

	public static void main(String[] args) {
		
		Boolean variavelVerdadeira = true;
		Boolean variavelFalsa = false;
		
		System.out.println("Variável Verdadeira: " + variavelVerdadeira);
		System.out.println("Variável Verdadeira: " + variavelFalsa);
		
		System.out.println("-----------------------------------");
		
		//validar se uma pessoa tem idade para tirar cnh
		
		Integer idade = 17;
		Boolean podeTirarCNH = idade >= 18;
		
		System.out.println("Pode tirar carteira? " + podeTirarCNH);

	}

}
