package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import entities.Product;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("HD case", 80.90));
		list.add(new Product("Tablet", 80.90));
		
		//Implementação da interface Function
		//List<String> names = list.stream().map(new UppercaseName()).collect(Collectors.toList());
		
		//método estatico
		//List<String> names = list.stream().map(Product::staticUpperCase).collect(Collectors.toList());
		
		//metodo nao estatico
		//List<String> names = list.stream().map(Product::nonStaticUpperCase).collect(Collectors.toList());
		
		//declaraçao lambda
		//Function<Product, String> func = p -> p.getName().toUpperCase();
		//List<String> names = list.stream().map(func).collect(Collectors.toList());
		
		//lambda inline
		List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
		
		names.forEach(System.out::println);
	}
}
