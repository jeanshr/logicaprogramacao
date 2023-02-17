import java.util.Scanner;

public class ExercicioAlunoComConstante {
	
	static final Integer notaCorte = 70;

	public static void main(String[] args) {
		
		Scanner leitorDados = new Scanner(System.in);
		
		System.out.println("Nota: ");
		Integer nota = leitorDados.nextInt();
		
		Boolean validarNota = nota >= notaCorte;
		
		if (validarNota) {
			System.out.println("Parabéns, vc passou!");
		} else {

			System.out.println("Infelizmente vc não passou!");
		}
		
		leitorDados.close();


	}

}
