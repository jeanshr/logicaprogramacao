
public class EstruturaIf {

	public static void main(String[] args) {
		
		Boolean movimentaAConta = true;
		Boolean contigaAntiga = true;
		Boolean nomeLimpo = true;
		Boolean validadorEmprestimo = movimentaAConta && contigaAntiga && nomeLimpo;
		Double emprestimo = 4000.00;
		Double movimentacaoMedia = 2000.00;
		
		if (validadorEmprestimo) {
			
			System.out.println("Sim, pode liberar!");
			
		} else {
			
			System.out.println("Não pode!");
			 
		}
		

	}

}
