
public class Vetores2DSemanaComMaiorFaturamento {

	public static void main(String[] args) {
		Double[] semanaUm = new Double[]{ 1000.0, 1500.0, 1250.0, 2100.0, 1350.0, 970.0, 0.0 };
		Double[] semanaDois = new Double[]{ 1050.0, 2500.0, 3250.0, 1100.0, 1430.0, 900.0, 0.0 };
		Double[] semanaTres = new Double[]{ 1700.0, 1300.0, 1450.0, 2000.0, 1390.0, 800.0, 0.0 };
		Double[] semanaQuatro = new Double[]{ 2100.0, 1600.0, 1850.0, 2100.0, 1220.0, 998.0, 0.0 };
		Double somaLinhasSemanas = 0.0;
		Double retornaValorMaiorSemana = 0.0;
		Integer contadorSemana = 0;

		Double[][] mes = new Double[][] { semanaUm, semanaDois, semanaTres, semanaQuatro };

		System.out.println("==========Soma de Semanas============");

		//varrendo as linhas dos vetores de 1 dimensão
		for(int i = 0; i < mes.length; i++) {

			somaLinhasSemanas = 0.0;
			Double[] lerLinhasSemanas =  mes[i]; 

			//Somando as linhas dos vetores de 1 dimensão
			for(int y = 0; y < lerLinhasSemanas.length; y++) {
				somaLinhasSemanas += lerLinhasSemanas[y];
			}

			if(somaLinhasSemanas > retornaValorMaiorSemana) {
				retornaValorMaiorSemana = somaLinhasSemanas;
				contadorSemana = i + 1;
			}

			System.out.println("Semana " + (i + 1) + ": " + somaLinhasSemanas);
		}

		System.out.println("=====================================");
		System.out.println();
		System.out.println("=============Maior Semana========================");
		System.out.println("A maior semana foi a Semana " + contadorSemana +", com faturamento de R$ " + retornaValorMaiorSemana);
		System.out.println("=====================================");
	}

}
