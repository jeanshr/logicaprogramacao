import java.util.*;
public class VetorTarefasDoDia {

	public static void main(String[] args) {
		
//		Crie um sistema onde o usuário vai cadastrar, 
//		utilizando o console, as 5 tarefas mais importantes do dia dele. 
//		Armazene cada uma dessas tarefas em um vetor e, 
//		no final, imprima as tarefas novamente.
		
		Scanner scan = new Scanner(System.in);
		
		String[] mostImportantTaskPerDay = new String[5];
		String enterWithYourTaskDescription = null;
		
		System.out.print("What do you need to do for today?: ");
		
		//popula o vetor com as tarefas
		for(int i = 0; i < mostImportantTaskPerDay.length; i++) {
			enterWithYourTaskDescription = scan.nextLine();
			mostImportantTaskPerDay[i] = enterWithYourTaskDescription;
		}
		
		//imprime as tarefas
		System.out.println("Lista de Tarefas para hoje!!!");
		System.out.println();
		
		for(int j = 0; j < mostImportantTaskPerDay.length; j++) {
			Integer countNumberedTasks = j+1;
			System.out.println(countNumberedTasks + ": " + mostImportantTaskPerDay[j]);
		}
		
		scan.close();

	}

}
