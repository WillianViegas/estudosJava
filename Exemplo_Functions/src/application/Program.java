package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import services.ProductServices;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("HD case", 80.90));
		list.add(new Product("Tablet", 350.50));
		
		ProductServices ps = new ProductServices();
		
		double sum = ps.filteredSum(list, p -> p.getPrice() < 100.0);
		
		System.out.println("Sum = " + String.format("%.2f", sum));
	}

}
