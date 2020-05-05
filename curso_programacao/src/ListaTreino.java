import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListaTreino {

	public static void main(String[] args) {
		//instancia a lista
		List<String> lista = new ArrayList<>();
		
		//adiona itens
		lista.add("Joao");
		lista.add("Vinicius");
		lista.add("Kioto");

		//foreach do java
		for(String x : lista) {
			System.out.println(x);
		}
		
		System.out.println();
		//remove na posicao do index
		lista.remove(0);
		
		lista.add("Miguel");
		
		for(String x : lista) {
			System.out.println(x);
		}
		
		System.out.println();
		//tamanho da lista
		System.out.println(lista.size());
		System.out.println();
		
		//remove se a condicao for verdadeira
		lista.removeIf(x -> x.charAt(0) == 'V');
		
		for(String x : lista) {
			System.out.println(x);
		}
		
		System.out.println();
		//posicao na lista do item
		System.out.println(lista.indexOf("Miguel"));
		System.out.println();
		
		//instancia uma nova lista e passa pra ela os dados referentes a uma outra com uma condição
		List<String> result = lista.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());
		List<String> l2 = lista;
		
		for(String x : l2) {
			System.out.println("L2: "+x);
		}
		
		System.out.println();
		
		for(String x : result) {
			System.out.println("result: " + x);
		}
		
		System.out.println();
		//verifica se existe o item na lista e retorna null se n existir
		String name = lista.stream().filter(x-> x.charAt(0) == 'K').findFirst().orElse(null);
		System.out.println(name);
		
		
	}

}
