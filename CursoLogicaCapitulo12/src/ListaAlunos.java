
public class ListaAlunos {

	static final int QUANTIDADE_LISTA = 5;

	Aluno[] lista = new Aluno[QUANTIDADE_LISTA];

	int tamanhoLista = 0;

	void adicionar(Aluno aluno){
		if(lista.length == tamanhoLista){
			Aluno[] novaLista = new Aluno[QUANTIDADE_LISTA + lista.length];
			for(int i = 0; i < lista.length; i++){
				novaLista[i] = lista[i];
			}
			lista = novaLista;
		}
		lista[tamanhoLista] = aluno;
		tamanhoLista++;
	}
		Aluno obter(int indice){
			return lista[indice];
		}
		int tamanho(){
			return tamanhoLista;
		}
	void remover(Aluno aluno){
		for(int i = 0; i < tamanhoLista; i++){
			Aluno a = lista[i];
			if(a != null && a.equals(aluno)){
				//remover o aluno do array
				remover(i);
				break;
			} else if(a == null && aluno == null){
				remover(i);
				break;
			}
		}
	}
	void remover(int indice){
		int indiceInicial = indice + 1;
		for(int i = indiceInicial; i < tamanhoLista; i++){
			lista[i - 1] = lista[i];
		}
		tamanhoLista--;
		lista[tamanhoLista] = null;
	}
	void ordenar() {
		for(int i = 1; i < tamanhoLista; i++) {
			Aluno alunoPosicaoBase = lista[i];
			int indicePosicaoBase = i;

			while(indicePosicaoBase > 0) {
				int indicePosicaoAnterior = indicePosicaoBase - 1;
				Aluno alunoPosicaoAnterior = lista[indicePosicaoAnterior];
				
				Boolean alunoPosicaoAnteriorVemDepoisDe = alunoPosicaoAnterior == null 
						|| alunoPosicaoAnterior.vemDepoisDe(alunoPosicaoBase);
				
				if(alunoPosicaoAnteriorVemDepoisDe) {
					lista[indicePosicaoBase] = lista[indicePosicaoAnterior];
					indicePosicaoBase--;
				} else {
					break;
				}
			}
			lista[indicePosicaoBase] = alunoPosicaoBase;
		}
	}
}
