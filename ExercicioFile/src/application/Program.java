package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Product;
import model.services.ProductFile;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Product> list = new ArrayList<>();
		List<String> lines = new ArrayList<>();
		
		System.out.print("How many products do you want write? ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Product Number #" + i);
			System.out.print("Name of product: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Value of product: ");
			double value= sc.nextDouble();
			System.out.print("Quantity of product: ");
			int quantity = sc.nextInt();
			
			list.add(new Product(name, value, quantity));
			System.out.println();
		}
		
		for(Product l : list) {
			System.out.println("Products: " + l);
			lines.add(l.toString());
			
		}
		
		System.out.print("Enter a path: ");
		sc.nextLine();
		String strPath = sc.nextLine();
		ProductFile file = new ProductFile(strPath);

		
		file.writeFile(lines, strPath);
		System.out.println(file.getPath());
	
		sc.close();
		

	}

}
