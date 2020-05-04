import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.Rectangle;
import entities.Student;

public class ExercicioOrientacao_Objetos {

	public static void main(String[] args) {
		
	}

	
	public static void Exercicio01Rectangle() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Rectangle rec = new Rectangle();
		
		System.out.println("Enter rectangle width and height: ");
		rec.width = sc.nextDouble();
		rec.height = sc.nextDouble();
		
		System.out.println("AREA = " + String.format("%.2f", rec.areaRetangulo()));
		System.out.println("PERIMETER = " + String.format("%.2f", rec.perimetroRetangulo()));
		System.out.println("DIAGONAL = " + String.format("%.2f", rec.diagonalRetangulo()));
		
		sc.close();
	}
	
	public static void Exercicio02Salary() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee emply = new Employee();
		
		System.out.print("Name: ");
		emply.name = sc.nextLine();
		
		System.out.print("Gross Salary: ");
		emply.gSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		emply.tax = sc.nextDouble();
		
		System.out.println();
		System.out.printf("Employee: %s, $ %.2f%n", emply.name, emply.calcSalary());
		
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double perc = sc.nextDouble();
		double total = emply.increaseSalary(perc);
		
		System.out.println();
		System.out.printf("Updated data: %s, $ %.2f", emply.name, total);
		
		sc.close();
	}
	
	public static void Exercicio04Student() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student study = new Student();
		
		study.name = sc.nextLine();
		study.n1 = sc.nextDouble();
		study.n2 = sc.nextDouble();
		study.n3 = sc.nextDouble();
		
		double notaFinal = study.somaNotas();
		System.out.printf("FINAL GRADE = %.2f%n", notaFinal);
		
		if(notaFinal >= 60.00) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", study.faltaNota(notaFinal));
		}
		
		sc.close();
	}
}
