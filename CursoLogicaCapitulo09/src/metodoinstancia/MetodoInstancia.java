package metodoinstancia;

public class MetodoInstancia {

	public static void main(String[] args) {
		
		Cliente instanciaCliente = new Cliente();
		
		instanciaCliente.primeiroNome = "Jean";
		instanciaCliente.ultimoNome = "Cunha";
		instanciaCliente.telefone = "12345678910";
		instanciaCliente.email = "jean_cunha@gmail.com";
		
		//instanciando o msm objeto com dados diferentes
		Cliente instanciaCliente2 = new Cliente();
		instanciaCliente2.primeiroNome = "Veronica";
		instanciaCliente2.ultimoNome = "Kita";
		instanciaCliente2.telefone = "3410001223";
		instanciaCliente2.email = "veronica_kita@gmail.com";
		
		System.out.println("Nome cliente: " + instanciaCliente.obterNomeCompleto() + "\nDDD: " + instanciaCliente.obterDDD() + " Telefone: " + instanciaCliente.telefone);
		System.out.println("------------------------------------");
		System.out.println("Nome cliente: " + instanciaCliente2.obterNomeCompleto() + "\nDDD: " + instanciaCliente2.obterDDD() + " Telefone: " + instanciaCliente2.telefone);

	}

}
