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

import entities.Comment;
import entities.Department;
import entities.HourContract;
import entities.Order;
import entities.Post;
import entities.Product;
import entities.Products;
import entities.Triangle;
import entities.Worker;
import entities.enums.OrderStatus;
import entities.enums.WorkerLevel;
import util.CurrencyConverter;

public class Program {
	
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comment c1 = new Comment("Have a nice trip!");
		Comment c2 = new Comment("Wow that's awesome!");
		Post p1 =  new Post(sdf.parse("21/06/2018 13:05:44"), "Traveling to New Zealand", 
				"I'm going to visit this wonderful country!", 12);
		
		p1.addComment(c1);
		p1.addComment(c2);

		
		
		Comment c3 = new Comment("Good night");
		Comment c4 = new Comment("May the force be with you");
		Post p2 = new Post(
				sdf.parse("28/07/2018 23:14:19"),
				"Good night guys",
				"See you tomorrow",5);
		
		p2.addComment(c3);
		p2.addComment(c4);
		System.out.println(p1);
		System.out.println(p2);
		
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
				//Adiciona o Marco na posição dois da lista
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
				//index of padrão
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
	
	public static void utfExercicio() {
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
	
	public static void exemploEnum() {
Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order);
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);
	}
	
	public static void exercicioWorker() throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter department's name: ");
		String departmentName = sc.nextLine();
		
		System.out.println("Enter worker data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Level: ");
		String level = sc.nextLine();
		
		System.out.print("Base Salary: ");
		double baseSalary = sc.nextDouble();
		
		Worker worker = new Worker(name, WorkerLevel.valueOf(level), baseSalary,new Department(departmentName));
		
		System.out.print("How many contracts to this worker? ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Enter contract #" + i + " data:");
			System.out.print("Date (DD/MM/YYY): ");
			Date contractDate = sdf.parse(sc.next());
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("Duration(hours)");
			int hours = sc.nextInt();
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			worker.addContract(contract);
		}
		
		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for " + monthAndYear + ":" 
		+ String.format("%.2f",worker.income(year, month)));
		
		sc.close();
	}
}
