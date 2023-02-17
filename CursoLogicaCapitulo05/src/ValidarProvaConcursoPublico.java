import java.util.*;
public class ValidarProvaConcursoPublico {
	
	static final Integer notaMinimaParaPassar = 150;
	static final Integer notaCorteReprovacao = 60;
	

	public static void main(String[] args) {
		
		Scanner leitorDados = new Scanner(System.in);

		Integer notaMatematica = 0;
		Integer notaPortugues = 0;
		
		
		
		System.out.print("Nota de Matemática: ");
		notaMatematica = leitorDados.nextInt();
		
		System.out.print("Nota de Português: ");
		notaPortugues = leitorDados.nextInt();
		
		Integer resultadoProva = notaMatematica + notaPortugues;
		Boolean validadorAprovacao = resultadoProva >= notaMinimaParaPassar && 
				(notaMatematica >= notaCorteReprovacao) && (notaPortugues >= notaCorteReprovacao);
		
		if(validadorAprovacao) {
			
			System.out.println("Parabéns, vc passou!");
		} else {
			System.out.println("Infelizmente, vc não passou!");
		}
		
		leitorDados.close();

	}

} // Professor https://github.com/algaworks/curso-logica-de-programacao-com-java/blob/master/05.03-exercicio/CursoLogicaCapitulo05/src/Exercicio01.java
