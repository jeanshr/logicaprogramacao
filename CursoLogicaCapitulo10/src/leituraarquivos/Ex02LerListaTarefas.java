package leituraarquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Ex02LerListaTarefas {

	public static void main(String[] args) throws IOException {
		//A classe FILES retorna uma lista, e aqui estamos pegando o retorno dessa lista para carregar uma lista nossa ao qual podemos iterar p imprimir
		List<String> linhas = leitorArquivos("/Users/jecunha/Documents/logicaprogramacao/CursoLogicaCapitulo10/txt/Ex02ListaDeTarefas.txt");
		
		System.out.println("Lista de Tarefas do dia: ");
		System.out.println("------------------------");
		
		for(int i = 0; i < linhas.size(); i++) {
			String descricaoTarefa = linhas.get(i);
			System.out.println("Atividade " + i + ": " + descricaoTarefa);
		}
		System.out.println("------------------------");
	}
	
	static List<String> leitorArquivos(String arquivo) throws IOException{
		Path path = Paths.get(arquivo);
		return Files.readAllLines(path);
	}
	
}
