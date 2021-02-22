package br.com.estudos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ClasseArrayList {

	public static void main(String[] args) {
		
		
		/*Criando a lista de cores*/
		ArrayList<String>listaCores = new ArrayList<>();
		
		/*Adicionando a lista de cores*/
		
		listaCores.add("Amarelo");
		listaCores.add("Vermelho");
		listaCores.add("Azul");
		listaCores.add("Verde");
		listaCores.add("Roxo");
		listaCores.add("Lilás");
		listaCores.add("Preto");
		listaCores.add("Cinza");
		listaCores.add("Branco");
		listaCores.add("Branco"); // A lista aceita valores repetidos
		listaCores.add("");
		
		System.out.println(listaCores);
		
		listaCores.remove(2); // Permite a remoção por indice
		
		System.out.println(listaCores);
		
		listaCores.remove("Preto"); // Permite a remoção pelo valor
		
		System.out.println(listaCores);
				
		Collections.sort(listaCores); // Permite a ordenação
		
		System.out.println(listaCores);
		
		Collections.reverse(listaCores); // Permite a ordenação reversa
		
		System.out.println(listaCores);
		
		System.out.println(listaCores.get(2)); // Permite a exibição do valor por indíce da lista
		
		System.out.println(listaCores.contains("Branco")); // Permite varificar se dentro da lista contem um determinado valor
		
		System.out.println(listaCores.indexOf("Vermelho")); // Exibe o indice da lista de um determinado valor
		
		System.out.println(listaCores.isEmpty()); // Verifica se a lista está vazia
		
		listaCores.set(5, "Rosa"); // Permite a atualização de valores na lista
		
		System.out.println(listaCores);
		
		System.out.println(listaCores.size()); // Exibe o tamanho da lista
		
		// É possivel percorrer a lista utilizando o For Each
		System.out.println("=======");
		for(String cores : listaCores) {
			System.out.println(cores);
		}
		
		// É possivel percorrer a lista através de for simples acessando os valores pelo método get
		System.out.println("========");
		
		for(int i= 0; i < listaCores.size(); i++) {
			System.out.println(listaCores.get(i));
		}
		
		
	    // É possível percorrer através de iterator		
		Iterator<String>listaIterator = listaCores.iterator();
		System.out.println("=========");
		
		while(listaIterator.hasNext()) {
			System.out.println(listaIterator.next());
		}
		
		
		
		/*
		 * Como visto, a utilização da classe ArrayList é flexível e permite um série de funcionalidades que podem ser muito útil no dia a dia.
		 */
				

	}

}
