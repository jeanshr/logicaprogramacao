import java.util.*;

public class ImprimeNomeDiaSemanaSwitchCase {

	public static void main(String[] args) {
		
		Scanner leitorDados = new Scanner(System.in);
		
		System.out.println("Qual dia da Semana?: ");
		Integer diaSemana = leitorDados.nextInt();
		
		String dia = null;

		switch (diaSemana) {
		case 1: dia = "Domingo";
			
			break;
		case 2: dia = "Segunda-feira";
		
		break;
		case 3: dia = "Terça-feira";
		
		break;
		case 4: dia = "Quarta-feira";
		
		break;
		case 5: dia = "Quinta-feira";
		
		break;
		case 6: dia = "Sexta-feira";
		
		break;
		case 7: dia = "Sábado";
		
		break;

		default: System.err.println("Digitar números entre 1 e 7!");
		    System.exit(1);
			break;
		}
		
		System.out.println("Hoje é: " + dia);
		
		leitorDados.close();
	}

}
