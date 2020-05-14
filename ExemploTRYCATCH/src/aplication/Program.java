package aplication;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\willi\\Documents\\a.txt");
		Scanner sc = null; 
		
		try {
			sc = new Scanner(file);
			while(sc.hasNextLine()){
				System.out.println(sc.nextLine());
			}
		}
		catch(FileNotFoundException e) {
			System.out.println("Erro oppening file: " + e.getMessage());
		}
		finally {
			if(sc != null) {
				sc.close();
			}
		}
	}
	
	public static void method1() {
		System.out.println("START 1");
		method2();
		System.out.println("END 1");
	}
	
	public static void method2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("START");
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid posistion");
			//imprime na tela a exceção
			e.printStackTrace();
		}
		catch(InputMismatchException e) {
			System.out.println("Input Error");
		}
		
		System.out.println("END");
		
		sc.close();
	}

}
