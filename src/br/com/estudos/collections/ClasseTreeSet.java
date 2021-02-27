package br.com.estudos.collections;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

public class ClasseTreeSet {

	public static void main(String[] args) {
		
		
		TreeSet<Integer>numeros = new TreeSet<>(new Comparator<>() {

			@Override
			public int compare(Integer arg0, Integer arg1) { // Realiza a ordenação em ordem decrescente de números inteiros
				
				if(arg0 < arg1) {
					return 1;
				}else
					if(arg0 > arg1) {
						return -1;
					}else {
						return 0;
					}
			}
		});
		
		Random r = new Random();
		for(int i = 0; i < 20; i ++) {
			numeros.add(r.nextInt(500));
		}
		
		System.out.println("Não mantem a ordem de inserção dos elementos e ordena os valores em ordem decrescente por conta do comparator");
        System.out.println(numeros+"\n");
		
        System.out.println("Verifica se está vazio");
		System.out.println(numeros.isEmpty()+"\n"); 
		
		System.out.println("Verifica o tamanho");
		System.out.println(numeros.size()+"\n"); 
		
		System.out.println("Permite remover elemento pelo nome (40)");
		numeros.remove(40); 
		System.out.println(numeros+"\n");
		
		System.out.println("Verifica se determinado elemento exite(20)");
		System.out.println(numeros.contains(20)+"\n"); 
		
		System.out.println("Exibe os valores menores (ordem crescente) ou maiores (ordem decrescente) que o valor passado no parâmetro (100)");
		System.out.println(numeros.headSet(100)+"\n");
		
		System.out.println("Próximo valor da árvore e que é maior (order crescente) ou menor (ordem decrescente) que o valor passado no parâmetro (100)");
		System.out.println(numeros.higher(100)+"\n"); 
		
		System.out.println("Valor que antecede (ordem crescente) ou que sucede (ordem decrescente) o valor passsado no parâmetro (100)");
		System.out.println(numeros.lower(100)+"\n");
		
		System.out.println("Primeiro valor do lado esquerdo para a direita da árvore");
		System.out.println(numeros.first()+"\n");
		
		System.out.println("Primeiro valor do lado direito para a esquerda da árvore");
		System.out.println(numeros.last()+"\n");	
		
		System.out.println("Exibe e remove o primeiro valor do lado esquerdo da árvore");
		System.out.println(numeros.pollFirst()); 
		System.out.println(numeros+"\n");
		
		System.out.println("Exibe e remove o primeiro valor do lado direito da árvore");
		System.out.println(numeros.pollLast()); 
		System.out.println(numeros+"\n");	
		
		System.out.println("Exibe os valores valores que sucedem ou antecedem o valor do parametro (100) que estejam do lado direito da árvore");
		System.out.println(numeros.tailSet(100));
		System.out.println("");
		
		System.out.println("Lista valores através de FOR EACH");		
		for(int a : numeros) {
			System.out.println(a);
		}
		System.out.println("");
		
		System.out.println("Lista valores através de ITERATOR");		
		Iterator<Integer>iteratorNumeros = numeros.iterator();
		while(iteratorNumeros.hasNext()) {
			System.out.println(iteratorNumeros.next());
		}
		System.out.println("");
		System.out.println("Não permite acessar valores do set através do método get");
		/*for(int i=0; i < numeros.size(); i++) {
			System.out.println(numeros[i]);
		}*/		

	}

	
}
