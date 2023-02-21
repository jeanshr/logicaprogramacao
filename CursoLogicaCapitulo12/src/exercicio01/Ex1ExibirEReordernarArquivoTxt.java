package exercicio01;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class Ex1ExibirEReordernarArquivoTxt {
	
	public static void main(String[] args) throws IOException {

		List<String> retornarNomesDoArquivoTxt = lerArquivosDeUmDiretorio("/Users/jecunha/Documents/logicaprogramacao/CursoLogicaCapitulo12/src/txt/listaNomesForaDeOrdem.txt");

		iterarListaDeNomes(retornarNomesDoArquivoTxt);
		ordenar(retornarNomesDoArquivoTxt);
		iterarListaDeNomes(retornarNomesDoArquivoTxt);
		gravarNovoArquivo(retornarNomesDoArquivoTxt);
	}
	
	//métodos

	private static void iterarListaDeNomes(List<String> retornarNomesDoArquivoTxt) {
		for(int i = 0; i < retornarNomesDoArquivoTxt.size(); i++) {
			String listaDeNomes = retornarNomesDoArquivoTxt.get(i);
			int enumeradorDeImpressao = i + 1;
			System.out.println(enumeradorDeImpressao + ": " + listaDeNomes);
		}
		System.out.println("------------------------");
	}
	static List<String> lerArquivosDeUmDiretorio(String arquivo) throws IOException{
		Path path = Paths.get(arquivo);
		return Files.readAllLines(path);
	}
	static void ordenar(List<String> listaNomesArquivos) {
		Collections.sort(listaNomesArquivos);
	}
	static void gravarNovoArquivo(List<String> listaNomesArquivos) throws IOException {
		Path arquivo = Paths.get("/Users/jecunha/Documents/logicaprogramacao/CursoLogicaCapitulo12/src/txt/novoArquivoComNomesOrdenados.txt");
		 Files.write(arquivo, listaNomesArquivos);
		 System.out.println("Arquivo gravado com sucesso");
	}
}
