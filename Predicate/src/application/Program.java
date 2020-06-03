package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

import entities.Product;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("HD case", 80.90));
		
		//modo lambda inline
		list.removeIf(p -> p.getPrice() >= 100);
		
		//modo instanciando a interface Predicate
		//list.removeIf(new ProductPredicate());
		
		//reference method com metodo statico
		//list.removeIf(Product::staticProductPredicate);
		
		//reference method com metodo nao estatico
		//list.removeIf(Product::nonstaticProductPredicate);
		
		//expressão lambda declaraa
		//Predicate<Product> pred = p -> p.getPrice() >= 100.0;
		//list.removeIf(pred);
		
		
		for(Product p : list) {
			System.out.println(p);
		}
	}
}
