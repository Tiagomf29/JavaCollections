package br.com.estudos.collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ClasseQueue {

	public static void main(String[] args) {
		
		/* A classe Queue possui algumas caracteristicas diferentes da classe ArrayListe por exemplo. 
		A mesmo é bastante útil para implementações de estrutura de dados do tipo FILA, ou seja,
		o primeiro elemento que entra na fila é a primeira que sai. */
		
		Queue<String> fila = new LinkedList<>();
		
		fila.add("Marcelo");
		fila.add("João");
		fila.add("Rogerio");
		fila.add("Silvia");
		fila.add("Carmem");
		fila.add("Carmem"); // Aceita valores repetidos
		fila.add("");
		fila.add(null);
		
		System.out.println(fila); // Exibe todos os valores da fila na ordem de inserção		
		
		fila.remove("Rogerio");
		System.out.println(fila); // Permite a remoção de um valor da fila
		
		// Collections.sort(fila); Não permite ordenação
		
		// Collections.reverse(fila); Não permite ordenaçao reversa
		
		// fila.set(1,"Teste"); Não permite atualização
		
		fila.poll(); // Exibe o valor do primeiro elemento da fila e o remove
		System.out.println(fila);
		
		System.out.println(fila.peek()); // Exibe o o valor do primeiro elemento da fila e não o remove. 
		System.out.println(fila);
		
		// Caso o valor seja null, o mesmo é apresentando na tela		
		Queue<String> teste = new LinkedList<>();
		System.out.println(teste.peek());
		
		
		// é possível percorrer a fila com FOR EACH
		System.out.println("======");
		for(String nomes : fila) {
			System.out.println(nomes);
		}
		
		/*Não é possível percorrer a fila com for comum acessando o método get
		for(int i=0; i < fila.size(); i++) {
			System.out.println(fila.get(i));
		}
		*/
		
	    // É possível percorrer a fila com iterator
		System.out.println("======");
		Iterator<String>iteratorFila = fila.iterator();
		while(iteratorFila.hasNext()) {
			System.out.println(iteratorFila.next());
		}
		System.out.println("======");		
		
		System.out.println(fila.element()); // Também exibe o valor do primeiro elemento da fila e não o remove
		System.out.println(fila);
		
		// No entanto, caso o valor retornado seja null, uma excessão será lançado
		System.out.println(teste.element());		
		

	}

}
