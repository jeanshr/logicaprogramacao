import java.util.Scanner;

public class CalculadoraFamiliar {

	public static void main(String[] args) {
		
		Scanner leitorDados = new Scanner(System.in);
		
		/*Double valorContaLuz = null;
		Double valorContaAgua = null;
		Double valorContaTelefone = null;
		Double valorEscolaFilho = null;
		Double valorFaturaCartao = null;
		Double valorSupermercado = null;
		*/
		Double gastoTotalMensal = 0.0;
		
		
		
		System.out.print("valorContaLuz: ");
		gastoTotalMensal += leitorDados.nextDouble();
		
		System.out.print("valorContaAgua: ");
		gastoTotalMensal +=  leitorDados.nextDouble();
		
		System.out.print("valorContaTelefone: ");
		gastoTotalMensal +=  leitorDados.nextDouble();
		
		System.out.print("valorEscolaFilho: ");
		gastoTotalMensal +=  leitorDados.nextDouble();
		
		System.out.print("valorFaturaCartao: ");
		gastoTotalMensal +=  leitorDados.nextDouble();
		
		System.out.print("valorSupermercado: ");
		gastoTotalMensal += leitorDados.nextDouble();
		
		
		//gastoTotalMensal = valorContaLuz + valorContaAgua + valorContaTelefone + valorEscolaFilho + valorFaturaCartao + valorSupermercado;
		System.out.print("Gasto Total Mensal R$: " + gastoTotalMensal);
		
		leitorDados.close();
		//resolção professor https://github.com/algaworks/curso-logica-de-programacao-com-java/blob/master/04.07-exercicio/CursoLogicaCapitulo04/src/Exercicio03.java

	}

}
