package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of payers: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or Company (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			
			if(ch == 'i') {
				System.out.print("Health expeditures: ");
				double healthExpeditures = sc.nextDouble();
				
				list.add(new Individual(name, anualIncome, healthExpeditures));
			}
			else if(ch == 'c') {
				System.out.print("Number of employees: ");
				int employeeNumber = sc.nextInt();
				
				list.add(new Company(name, anualIncome, employeeNumber));
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		double sum = 0.0;
		for(TaxPayer tax : list) {
			System.out.println(tax.getName() + ": $ " + String.format("%.2f",tax.tax()));
			sum += tax.tax();
		}
		
		System.out.println();
		System.out.printf("TOTAL TAXES: $ %.2f", sum);
		sc.close();
	}

}
