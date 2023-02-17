
public class OperadoresLogicos {

	public static void main(String[] args) {
		
		Boolean carrinhoMaiorQue100 = false;
		Boolean periodoDePromocao = true;
		//Boolean aplicarDesconto = carrinhoMaiorQue100 && periodoDePromocao;
		Boolean aplicarDesconto = carrinhoMaiorQue100 || periodoDePromocao;
		
		if (aplicarDesconto) {
			
			System.out.println("Sim, aplique o desconto!");
			
		} else {
			System.out.println("nops!");
		}
		
	}

}
