import java.util.Scanner;

public class TipoTexto {

	public static void main(String[] args) {
		
		Scanner leitorDados = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = leitorDados.nextLine();
		
		System.out.println("Olá " + nome + "!");
		
		leitorDados.close();

	}

}
