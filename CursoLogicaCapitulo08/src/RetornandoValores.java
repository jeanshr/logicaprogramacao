
public class RetornandoValores {

	public static void main(String[] args) {
//		Regra de 3: Quero saber quanto é 20% de 50
//		50 ---- 100%
//		x ---- 20%
//		50 * 20 = x * 100
//		x = (50 * 20) / 100
		
		Double[] premissaInicial = new Double[] { 100.0, 100.0 };
		Double proporcao = 20.0;
		Double resultadoFinal = regraDeTres(premissaInicial, proporcao);
		
		System.out.println("Resultado: " + resultadoFinal);
		
	}
	
	static Double regraDeTres(Double[] premissa, Double proporcao) {
		Double resultado = (premissa[0] * proporcao) / premissa[1];
		return resultado;
	}

}
