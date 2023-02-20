package leituraarquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LeituraArquivos {

	public static void main(String[] args) throws IOException {
		Path arquivo = Paths.get("/Users/jecunha/Documents/logicaprogramacao/CursoLogicaCapitulo10/txt/Ex01ListaDeTarefas.txt");
		
		//A classe FILES retorna uma lista, e aqui estamos pegando o retorno dessa lista para carregar uma lista nossa ao qual podemos iterar p imprimir
		List<String> linhas = Files.readAllLines(arquivo);
		
		for(int i = 0; i < linhas.size(); i++) {
			String nome = linhas.get(i);
			System.out.println("Atividade " + i + ": " + nome);
		}
		
	}

}
