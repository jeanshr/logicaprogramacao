
public class VetoresMaisDe2Dimensoes {

	public static void main(String[] args) {
		
		Double[] faturamentoJaneiro = new Double[] {1500.0, 2000.0, 1700.0};
		Double[] faturamentoFevereiro = new Double[] {1000.0, 2500.0, 1800.0};
		Double[][] faturamentoAnual = new Double[][] {faturamentoJaneiro, faturamentoFevereiro};
		Double [][][] faturamentoQuinquenal = new Double[][][] {faturamentoAnual};
		Double [][][][] faturamentoDecada = new Double[][][][] {faturamentoQuinquenal};
	
		//iterando com vetores de 1 dimensão
		for(int i = 0; i < faturamentoAnual.length; i++) {
			System.out.println("Mês: " + (i + 1));
			
			Double[] mes = faturamentoAnual[i];
			
			//iterando com vetores de 2 dimensões
			for(int y = 0; y < mes.length; y++) {
				Double dia = mes[y];
				System.out.println("Dia " + (y + 1) + ": " + dia);
			}
			
			//iterando com vetores de 3 dimensões
			for(int z = 0; z < mes.length; z++) {
				
			}
		}
	}

}
