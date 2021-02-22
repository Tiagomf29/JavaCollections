package br.com.estudos.collections;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class ClasseLinkedList {

	public static void main(String[] args) {
		
		
		LinkedList<Integer>numerosPares = new LinkedList<>();
		
		numerosPares.add(10);
		numerosPares.add(20);
		numerosPares.add(30);
		numerosPares.add(40);
		numerosPares.add(50);
		numerosPares.add(60);
		numerosPares.add(60);
		numerosPares.add(60); // Permite valores repetidos
		
		System.out.println(numerosPares);
		
		numerosPares.remove(5); // Permite remover um elemento através do índice da lista
		
		System.out.println(numerosPares);	
		
		System.out.println(numerosPares.isEmpty()); 
		
		System.out.println(numerosPares.getLast()); // Retorna o último elemento da lista		
		System.out.println(numerosPares);
		
		System.out.println(numerosPares.getFirst()); // Retorna o primeiro elemento da lista		
		System.out.println(numerosPares);
		
		System.out.println("="+numerosPares.poll()); // exibe e remove o primeiro elemento da lista		
		System.out.println(numerosPares);
		
		System.out.println("=="+numerosPares.pollFirst()); // Exibe e remove o primeiro elemento da lista
		System.out.println(numerosPares);
		
		System.out.println("==="+numerosPares.pollLast()); // Exibe e remove o último elemento da lista
		System.out.println(numerosPares);
		
		Collections.sort(numerosPares); // Permite a ordenação em ordem ascendente		
		System.out.println(numerosPares);
		
		Collections.reverse(numerosPares); // Permite a ordenção em ordem descendente		
		System.out.println(numerosPares);
		
		// é pessível percorrer a lista através do FOR EACH
		System.out.println("==============");
		for(Integer a : numerosPares) {
			
			System.out.println(a);
		}
		
		// é possível exibir os valores da lista através do índice da lista
		System.out.println("==============");
		for(int i = 0; i < numerosPares.size(); i++) {
			System.out.println(numerosPares.get(i));
		}
		
		// é possível exibir o valor da lista através de iterator
		System.out.println("==============");
		Iterator<Integer> iteratorNumeros = numerosPares.iterator();		
		while(iteratorNumeros.hasNext()) {
			System.out.println(iteratorNumeros.next());
		}
		System.out.println("==============");		
		
		System.out.println("*"+numerosPares.peek()); // Exibe o primeiro elemento da lista sem remover da lista, e caso a lista esteja vazio retorna o null 		
		System.out.println(numerosPares);
		
		System.out.println("**"+numerosPares.peekFirst()); // Exibe o primeiro elemento da lista sem remover da lista, e caso a lista esteja vazio retorna o null 		
		System.out.println(numerosPares);	
		
		System.out.println("***"+numerosPares.peekLast()); // Exibe o último elemento da lista sem remover da lista, e caso a lista esteja vazio retorna o null 		
		System.out.println(numerosPares);			
		
		System.out.println(numerosPares.element()); // Exibe o primeiro elemento da lista sem remover da lista, e caso a lista esteja vazio é lançado uma excessão		
		System.out.println(numerosPares);
				
		/* o linkedList é indicado quando se existe a necessidade de acessar elementos no inicio da lista ou no final da lista
		 * tanto somente para exibição quanto para exibição e remoção ao mesmo tempo. O mesmo permite valores repetidos e ordenação 
		 * de elementos.*/
		
	}

}
