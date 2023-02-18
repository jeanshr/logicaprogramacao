
public class Recursividade {

	public static void main(String[] args) {
		String[] alunos =  new String[] {"Jean", "Veve", "Tico"};
//		imprimirNumero(0);
		iterarNomes(alunos, 0);

	}
	
	static void iterarNomes(String[] alunos, Integer i) {
		
		//iterando com for
//		for(int i = 0; i < alunos.length; i++) {
//			System.out.println("Aluno: " + alunos[i]);
//		}
		
		//iterando com recursividade
		System.out.println("Aluno: " + alunos[i]);
		if(++i < alunos.length) {
			iterarNomes(alunos, i);
		}
	}

//	static void imprimirNumero(Integer numero) {
//		System.out.println("Número: " + numero);
//		if(numero < 10) {
//			imprimirNumero(++numero);
//		}
//	}

}
