import java.util.*;
public class CalculadoraComRecursividade {

	static Integer multiplicador = 0;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		imprimir("Entre com um número: ");
		Integer multiplicando = scanner.nextInt();
		
		imprimirTabuada(multiplicando, multiplicador);
		
		scanner.close();
	}
	
	static void imprimir(String texto) {
		System.out.print(texto);
	}
	
	static void imprimirTabuada(Integer multiplicando, Integer multiplicador) {
		Integer resultado = multiplicando * multiplicador;
		
		System.out.println(multiplicando + " x " + multiplicador + " = " + resultado);
		multiplicador++;
		
		if(multiplicador <= 10) {
			imprimirTabuada(multiplicando, multiplicador);
		}
	}

}//Solução professor https://github.com/algaworks/curso-logica-de-programacao-com-java/blob/master/08.09-exercicio/CursoLogicaCapitulo08/src/Exercicio04.java
