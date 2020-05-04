import java.util.Locale;
import java.util.Scanner;

public class Exercicio03_for {

	public static void main(String[] args) {
		
		
	}

	public static void exercicio01(){
	Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		for(int i = 0; i<x; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
	
		sc.close();
	}
	
	public static void exercicio02(){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int in = 0;
		int out = 0;
		
		for(int i = 0; i < x; i++) {
			
			int y = sc.nextInt();
			
			if(y >= 10 && y <=20) {
				in++;
			}
			else {
				out++;
			}
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		sc.close();

	}
	
	public static void exercicio03() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		double a = 0;
		double b = 0;
		double c = 0;
		double media = 0;
		
		for(int i = 0; i < x; i++) {
			a = sc.nextDouble();
			b = sc.nextDouble();
			c = sc.nextDouble();
			
			media = ((a * 2) + (b * 3) + (c * 5)) / 10;
			System.out.printf("%.1f",media);
		}
		
		sc.close();

	}
	
	public static void exercicio04() {
Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		double result = 0.0;
		
		for(int i = 0; i < x; i++) {
			int y = sc.nextInt();
			int z = sc.nextInt();
			
			if (z == 0) {
				System.out.println("divisao impossivel");
			}
			else {
				result = (double) y / (double) z;
				System.out.printf("%.1f%n", result);
			}
		}
		
		sc.close();
	}
	
	public static void exercicio05() {
Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int valor = x;

		for(int i = 1; i < x; i++) {
			valor *= i;
		}
		
		if(valor == 0) {
			System.out.println("1");
		}
		else {
			System.out.println(valor);
		}
		
sc.close();
	}
	
	public static void exercicio06() {
Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();

		for(int i = 1; i <= x; i++) {

			if( x % i == 0) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}
	
	public static void exercicio07() {
Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		for(int i = 1; i <= x; i++) {
			System.out.print(i + " ");
			System.out.printf("%.0f ",Math.pow(i, 2));
			System.out.printf("%.0f%n",Math.pow(i,3));
		}
		
		sc.close();
	}
}

