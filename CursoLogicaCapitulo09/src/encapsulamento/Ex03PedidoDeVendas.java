package encapsulamento;

public class Ex03PedidoDeVendas {

	public static void main(String[] args) {
		Pedido pedido = new Pedido();
		
		System.out.println("------Dados Pedido------");
		pedido.setCodigo(12345);
		pedido.setSubtotal(100.0);
		pedido.setDesconto(10.0);
		
		System.out.println("Código Pedido: " + pedido.getCodigo()
		+ "\nSubtotal Pedido: " + pedido.getSubtotal()
		+ "\nDesconto: " + pedido.getDesconto()
		+ "\nTotal Pedido: " + pedido.getTotal());
		System.out.println("------------------------------------");
	}

} //solução professor https://github.com/algaworks/curso-logica-de-programacao-com-java/tree/master/09.07-exercicio/CursoLogicaCapitulo09/src/exercicio03
