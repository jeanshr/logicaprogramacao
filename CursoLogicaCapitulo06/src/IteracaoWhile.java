
public class IteracaoWhile {

	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
			System.out.println("um texto qualquer 10x");
		}
		
		System.out.println();
		
		int i = 0;
		while(i < 10) {
			if(i == 5) {
			System.out.println("parando pra testar");
			i++;
			continue;
			}
			System.out.println("um texto qualquer");
			i++;
		}

	}

}
