package br.com.estudos.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ClasseLinkedHashSet {

	public static void main(String[] args) {
		
		LinkedHashSet<String>timesFutebol = new LinkedHashSet<>();
		timesFutebol.add("Cruzeiro");
		timesFutebol.add("Atletico");
		timesFutebol.add("Corinthias");
		timesFutebol.add("Palmeiras");
		timesFutebol.add("Grêmio");
		timesFutebol.add("Internacional");
		timesFutebol.add("São Paulo");
		timesFutebol.add("Santos");
		timesFutebol.add("Santos"); // Não aceita valores repetidos
		
		
		System.out.println(timesFutebol); // Mantem a ordem de inserção dos elementos
		
		timesFutebol.remove("Atletico"); // Permite remover um elemento através do valor		
		System.out.println(timesFutebol);
		
		// Collections.sort(timesFutebol); Não permite a ordenação ascendente
		// Collections.reverse(timesFutebol); Não permite a ordenação descendente
		
		System.out.println(timesFutebol.size()); // Exibe o tamanho
		System.out.println(timesFutebol.isEmpty()); // verifica se está vazio
		System.out.println(timesFutebol.contains("Cruzeiro")); // Verifica se determinado elemento existe
		
		// É possivel percorrer com FOR EACH
		System.out.println("=============");
		for(String times : timesFutebol) {
			System.out.println(times);
		}
		
		/* Não é possivel percorer acessando a posição de cada elemento atraves do método get
		System.out.println("===========");
		for(int i = 0; i < timesFutebol.size(); i++) {
			System.out.println(timesFutebol.get(i));
		}*/
		
		// É possivel percorrer através de iterator
		System.out.println("============");
		Iterator<String>iteratorTimes = timesFutebol.iterator();
		while(iteratorTimes.hasNext()) {
			System.out.println(iteratorTimes.next());
		}
	    
		/* A grande vantágem de se utilizar o linkedHashSet em relação ao uso do HashSet é que o linkedHashSet mantem a ordem de inserção dos 
		 * elementos. Com isso ele se torna um pouco mais lento do que o HashSet*/
		

	}

}
