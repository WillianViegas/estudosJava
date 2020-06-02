package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.StudentData;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		try {
			System.out.print("How Many students for Course A? ");
			
			Set<StudentData> set = new HashSet<>();
			
			int nA = sc.nextInt();
			
			for(int i = 1; i <= nA; i++) {
				int numero = sc.nextInt();
				
				set.add(new StudentData(numero));
			}
			
			System.out.print("How Many students for Course B? ");
			
			int nB = sc.nextInt();
			
			for(int i = 1; i <= nB; i++) {
				int numero = sc.nextInt();
				
				set.add(new StudentData(numero));
			}
			
			System.out.print("How Many students for Course C? ");
			
			int nC = sc.nextInt();
			
			for(int i = 1; i <= nC; i++) {
				int numero = sc.nextInt();
				
				set.add(new StudentData(numero));
			}
			
			System.out.println("Total students: " + set.size());
			
		}
		catch(NullPointerException e) {
			
		}
		
		sc.close();
	}
}
