
public class OperadoresRelacionais {

	public static void main(String[] args) {
		
		Boolean tresMaiorQueDois = 3 > 2;
		Boolean tresMenorQueDois = 3 < 2;
		Boolean tresIgualATres = 3 == 3;
		Boolean tresDiferenteDeTres = 3 != 3;
		Integer cinco = 5;
		Integer seis = 6;
		Boolean cincoIgualACinco = cinco.equals(cinco); // cinco é igual a cinco? com variaveis
		Boolean cincoIgualASeis = cinco.equals(seis); // cinco é igual a 6? com variaveis
		
		System.out.println("3>2? " + tresMaiorQueDois);
		System.out.println("3<2? " + tresMenorQueDois);
		System.out.println("3=3? " + tresIgualATres);
		System.out.println("3!=3? " + tresDiferenteDeTres);
		System.out.println("Cinco: " + cincoIgualACinco);
		System.out.println("Cinco igual a seis? : " + cincoIgualASeis);
		
		Integer centoVinteOito = 128;
		Integer centoVinteOito02 = 128;
		Boolean comparaCentoVinteOitoFalso = centoVinteOito == centoVinteOito02;
		Boolean comparaCentoVinteOitoVerdadeiro = centoVinteOito.equals(centoVinteOito02);
		
		System.out.println("comparaCentoVinteOitoFalso: " + comparaCentoVinteOitoFalso);
		System.out.println("comparaCentoVinteOitoVerdadeiro: " + comparaCentoVinteOitoVerdadeiro);
	}

}
