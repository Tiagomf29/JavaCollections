import java.util.HashSet;
import java.util.Iterator;

public class ClasseHashSet {

	public static void main(String[] args) {
		
		HashSet<String> paises = new HashSet<>();
		
		paises.add("Brasil");
		paises.add("Uruguai");
		paises.add("Argentina");
		paises.add("Inglaterra");
		paises.add("Palonia");
		paises.add("Colombia");
		paises.add("Estados Unidos");
		paises.add("Alemanha");
		paises.add("Alemanha"); // Não permite valores repetidos
		paises.add(null);
		paises.add("");
		
		System.out.println(paises); //Não considera a ordem de inserção
		
		paises.remove("Palonia"); // Pemite a remoção de um determinado elemento
		System.out.println(paises);
		
		// Collections.sort(paises); Não permite ordenação ascendente
		// Collections.reverse(paises); Não permite ordenação descendente
		
		// System.out.println(paises.get(0)); Não permite acessar valores pel método get
		
		System.out.println(paises.size()); // Retorna o tamanho do set
		
		System.out.println(paises.contains("Brasil")); // Verifica se o valor passado como parâmetro existe no Set
		
		System.out.println(paises.isEmpty()); // Verifica se o Set está vazio
		
		// percorre o set sem considerar a ordem de inserção
		System.out.println("==================x");
		for(String a: paises) {
			System.out.println(a);
		}
		
		/* não permite acessar valores do set através do método get
		System.out.println("===================");
		for(int i = 0; i < paises.size(); i++) {
			System.out.println(paises.get(i));
		}*/
		
		//Permite percorrer o set através de iterator
		System.out.println("=======================");
		Iterator<String>paisesIterator = paises.iterator();
		while(paisesIterator.hasNext()) {
			System.out.println(paisesIterator.next());
		}
				
		paises.clear(); // limpa a lista
		
		System.out.println(paises.isEmpty()); // Verifica se o set está vazio
		
		/* O HashSet tem como característica principal não manter a ordem dos seus elementos conforme a inserção dos mesmos,
		 * não permite ordenação e reordenação dos elementos, não permite elementos repetidos e não permite o acesso a qualquer 
		 * elemento através de posição do set por algum método como por exemplo o método get que existe no ArrayList */
				
		
	}

}
