package escritaarquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex01ListaDeTarefas {

	public static void main(String[] args) throws IOException {
		ArrayList<String> listaTarefas = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);
		
		int i = 1;
		String tarefas = null;
		
		while(tarefas != "x") {
			System.out.print("Entre com a tarefa " + i + ": ");
			tarefas = scanner.nextLine();
			
			if(tarefas.equals("x")) {
				break;
			} else {
				listaTarefas.add(tarefas);
				i++;	
			}
		}

		System.out.println("Fim...");
		escreverDadosNoArquivo("/Users/jecunha/Documents/logicaprogramacao/CursoLogicaCapitulo10/txt/Ex02ListaDeTarefas.txt", listaTarefas);
		scanner.close();
	}
	
	static void escreverDadosNoArquivo(String arquivo, ArrayList<String> listaTarefas) throws IOException {
		Path path = Paths.get(arquivo);
		Files.write(path, listaTarefas);
	}

}//solução prof https://github.com/algaworks/curso-logica-de-programacao-com-java/blob/master/10.03-exercicio/CursoLogicaCapitulo10/src/exericio01/Exercicio01.java
