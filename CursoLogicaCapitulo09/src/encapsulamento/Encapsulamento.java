package encapsulamento;

public class Encapsulamento {

	public static void main(String[] args) {
		Cliente acessandoCliente = new Cliente();

		acessandoCliente.setNome("Jean CUnha");
		acessandoCliente.setTelefone("0129212801");
		
		System.out.println("Nome Completo: " + acessandoCliente.getNome() 
		+ "\nPrimeiro Nome: " + acessandoCliente.getPrimeiroNome() 
		+ "\nÚltimo Nome: " + acessandoCliente.getUltimoNome() 
		+ "\nTelefone: " + acessandoCliente.getTelefone());

	}

}
