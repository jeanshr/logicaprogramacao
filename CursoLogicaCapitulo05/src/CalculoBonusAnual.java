import java.util.*;
public class CalculoBonusAnual {

	public static void main(String[] args) {
		
		Scanner leitorDados = new Scanner(System.in);

		System.out.print("metaFaturamentoAnual: ");
		Double metaFaturamentoAnual = leitorDados.nextDouble();
		
		System.out.print("faturamentoAnualReal: ");
		Double faturamentoAnualReal = leitorDados.nextDouble();
		
		System.out.print("mediaSalarialFuncionario: ");
		Double mediaSalarialFuncionario = leitorDados.nextDouble();
		
		Boolean resultadoPLR = faturamentoAnualReal >= metaFaturamentoAnual;
		Boolean resultadoPLRParcial = faturamentoAnualReal >= (metaFaturamentoAnual * 0.8);
		Double bonusTotal = 0.0;

		
		if(resultadoPLR) {
			bonusTotal += mediaSalarialFuncionario + mediaSalarialFuncionario;
			System.out.println("Sua média salarial foi de R$: " + mediaSalarialFuncionario);
			System.out.println("Seu bonus é de R$: " + mediaSalarialFuncionario);
			System.out.println("Seu total a Receber será de R$: " + bonusTotal);
		} else if(!resultadoPLR && resultadoPLRParcial) {
			bonusTotal += (mediaSalarialFuncionario * 0.8) + mediaSalarialFuncionario;
			System.out.println("Seu total a Receber será de R$: " + bonusTotal);
		}
		else {
			System.out.println("Você não receberá bonus, e seu total é R$: " + mediaSalarialFuncionario);
		}
		leitorDados.close();

	}// soluçao prof https://github.com/algaworks/curso-logica-de-programacao-com-java/blob/master/05.05-exercicio/CursoLogicaCapitulo05/src/Exercicio02.java

}
