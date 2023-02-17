
public class OperadoresAtribuicao {

	public static void main(String[] args) {
		
		Integer numero = 7;
		Integer numeroMenos = 7;
		
		//numero = numero + 4; isso pode ser substituido por
		numero += 4;
		numeroMenos -= 4; //Lógica: Vc está mudando o valor da variável e nao acrescentando mais coisas nela. Então nesse caso seria:
		//numeroMenos, que vale 7 atualmente - 4 que é igual a 3
		
		System.out.println("numero += 4: " + numero);
		System.out.println("numeroMenos -= 4: " + numeroMenos);

	}

}
