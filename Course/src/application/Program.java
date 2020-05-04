package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.TimeZone;
import java.util.stream.Collectors;

import entities.Product;
import entities.Products;
import entities.Triangle;
import util.CurrencyConverter;

public class Program {
	
	public static void main(String[] args) throws ParseException {
	
		SimpleDateFormat sdf = new  SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println(sdf.format(d));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		//cal.add(Calendar.HOUR_OF_DAY, 4);
		//d = cal.getTime();
		
		int minutes = cal.get(Calendar.MINUTE);
		int month = 1 + cal.get(Calendar.MONTH);
		
		System.out.println("MIN: " + minutes);
		System.out.println("MON: " + month);
		System.out.println(sdf.format(d));
		
		
	}
	
	public static void Exercicio01Orientacao() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Enter the measures of triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
				
		double areaY = y.area();
				
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		if(areaX > areaY) {
			System.out.println("Larger area: X");
		}
		else {
			System.out.println("Larger area: Y");
		}
		sc.close();
	}
	
	public static void Exercicio02Orientacao(){
		
	}
	
	public static void Exercicio04Orientacao() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double price = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		double dollar = sc.nextDouble();
		double result = CurrencyConverter.conversor(dollar, price);
		System.out.printf("Ammount to be paid in reais = %.2f%n",result);
		
		sc.close();
	}
	
	public static void Exercicio05Orientacao() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		
		System.out.print("Price: ");
		double price = sc.nextDouble();
		
	/*	System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();*/
		
		Product product = new Product(name, price);
		product.setName("VideoGame");
		System.out.println("produto " + product.getName());
		product.setPrice(100.00);
		System.out.println("preco" + product.getPrice());
		
		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
	int	quantity = sc.nextInt();
		product.addProducts(quantity);
		System.out.println("Updated data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		System.out.println("Updated data: " + product);
		
		sc.close();

	}
	
	public static void ExercicioArrayP1() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for(int i = 0; i < n; i++) {
			vect[i] = sc.nextDouble();
		}
		
		double sum = 0.0;
		for(int i=0; i<n; i++) {
			sum += vect[i];
		}
		double avg = sum / n;
		
		System.out.printf("Average Height: %.2f%n", avg);
		
		sc.close();
	}
	
	public static void exercicioArrayP2() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Products[] vect = new Products[n];
		
		for(int i=0; i<vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Products(name, price);
		}
		
		double sum = 0.0;
		
		for(int i=0; i<vect.length; i++) {
			sum += vect[i].getPrice();
		}
		
		double avg = sum / n;
		
		System.out.printf("Average price: %.2f%n", avg);
		sc.close();
	}
	
	public static void foreach() {
	String[] vect = new String[] {"Maria", "Bob", "Alex"};
		
		//foreach em java
		for(String obj : vect) {
			System.out.println(obj);
		}
	}
	
	public static void Listas() {
		//list n pode ser de tipo primitivo tem que ser de Wrapper(que sao classes de tipo primitivo)
				List<String> list = new ArrayList<>();
				
				list.add("Maria");
				list.add("Alex");
				list.add("Bob");
				list.add("Ana");
				//Adiciona o Marco na posi��o dois da lista
				list.add(2, "Marco");
				
				System.out.println(list.size());

				//foreach
				for(String obj : list) {
					System.out.println(obj);
				}
				
				System.out.println("--------------");
				
				//remove todos com M usando expressao lambda
				list.removeIf(x -> x.charAt(0) == 'M');
				
				for(String obj : list) {
					System.out.println(obj);
				}
				
				System.out.println("--------------");
				//index of padr�o
				System.out.println("index of Bob: " + list.indexOf("Bob"));
				
				System.out.println("--------------");
				//passar valor para outra lista usando lambda
				List<String> result = list.stream().filter(x-> x.charAt(0) == 'A').collect(Collectors.toList());
				
				for (String obj : result) {
					System.out.println(obj);
				}
				System.out.println("--------------");
				
				//verificar o primeiro valor que contem a letra, se n existir retorna nulo
				String name = list.stream().filter(x-> x.charAt(0) == 'J').findFirst().orElse(null);
				System.out.println(name);
	}
	
	public static void datas() throws ParseException {
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date x1 = new Date();
		Date x2 = new Date(System.currentTimeMillis());
		Date x3 = new Date(0L);
		Date x4 = new Date(1000L * 60L *60L * 5L);
		
		Date y1 = sdf1.parse("25/06/2018");
		Date y2 = sdf2.parse("25/06/2018 15:42:07");
		Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println(sdf2.format(y3));
		System.out.println(sdf1.format(y1));
		System.out.println(sdf2.format(y2));
		
		System.out.println(sdf2.format(x1));
		System.out.println(sdf2.format(x2));
		System.out.println(sdf2.format(x3));
		System.out.println(sdf2.format(x4));
		
		System.out.println("-----------------------------");
		
		System.out.println(sdf3.format(y3));
		System.out.println(sdf3.format(y1));
		System.out.println(sdf3.format(y2));
		
		System.out.println(sdf3.format(x1));
		System.out.println(sdf3.format(x2));
		System.out.println(sdf3.format(x3));
		System.out.println(sdf3.format(x4));
		
	}
}
