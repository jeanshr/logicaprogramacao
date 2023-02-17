
public class OperadoresAritmeticos {

	public static void main(String[] args) {
		
		Integer Adicao = 1 + 1;
		Integer Subtracao = 1 - 1;
		Integer Divisao = 4 / 4;
		Integer Multiplicacao = 2 * 4;
		Integer Modulo = 7 % 4;
		Integer precedencia01 = 1 + 1 * 5;
		Integer precedencia02 = (1 + 1) * 5;
		Integer precedencia03 = 5*(1+1);
		Integer precedencia04 = 5*(1+1) + 2;
		Integer precedencia05 = 5 * ((1+1) + 2);
		Integer A = 5;
		Integer B = 1;
		Integer precedenciaComVariaveis = A * (B + B);
		
		System.out.println(Adicao);
		System.out.println(Subtracao);
		System.out.println(Divisao);
		System.out.println(Multiplicacao);
		System.out.println("Modulo: " + Modulo);
		System.out.println("precedencia01: " + precedencia01);
		System.out.println("precedencia02: " + precedencia02);
		System.out.println("precedencia3: " + precedencia03);
		System.out.println("precedencia4: " + precedencia04);
		System.out.println("precedencia5: " + precedencia05);
		System.out.println("precedenciaComVariaveis: " + precedenciaComVariaveis);
		
	}

}