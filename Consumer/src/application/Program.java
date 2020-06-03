package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

import enitties.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("HD case", 80.90));
		list.add(new Product("Tablet", 80.90));
		
		//implementação da interface Consumer
		//list.forEach(new PriceUpdate());

		//reference method como método estático
		//list.forEach(Product::staticPriceUpdate);
		
		//reference method como método nao estático
		//list.forEach(Product::nonStaticPriceUpdate);
		
		// Expressao lambda declarada
		//Consumer<Product> con = p -> {
		//p.setPrice(p.getPrice() * 1.1);
		// }
		//list.forEach(con);
		
		double val = 1.2;
		//Expressao lambda inline
		list.forEach(p->p.setPrice(p.getPrice() * val));
		
		list.forEach(System.out::println);

	}
}
