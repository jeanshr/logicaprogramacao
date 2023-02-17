
public class Vetores2D {

	public static void main(String[] args) {
		
		Double[] faturamentoJaneiro = new Double[] {1500.0, 2000.0, 1700.0};
		Double[] faturamentoFevereiro = new Double[] {1000.0, 2500.0, 1800.0};
		Double[][] faturamentoAnual = new Double[][] {faturamentoJaneiro, faturamentoFevereiro};

//		System.out.println("Faturamento do dia 1 de janeiro: " + faturamentoAnual[0][0]);
//		System.out.println("Faturamento do dia 3 de fevereiro: " + faturamentoAnual[1][2]);
		
		for(int i = 0; i < faturamentoAnual.length; i++) {
			System.out.println("Mês: " + (i + 1));
			
			Double[] mes = faturamentoAnual[i];
			
			for(int y = 0; y < mes.length; y++) {
				Double dia = mes[y];
				System.out.println("Dia " + (y + 1) + ": " + dia);
			}
		}
	}

}
