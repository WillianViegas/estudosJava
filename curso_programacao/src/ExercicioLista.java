import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Func;

public class ExercicioLista {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Func> list =  new ArrayList<>();
		
		System.out.println("How many employees will be registered? ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Employee #" + i);
			System.out.print("Id: ");
			int id = sc.nextInt();
			
			while(hasId(list, id)) {
				System.out.println("Id already taken. Try again: ");
				id = sc.nextInt();
			}
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			list.add(new Func(id, name, salary));
		}
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		
		Func existeId = list.stream().filter(x->x.getId() == id).findFirst().orElse(null);
		
		if(existeId != null) {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			existeId.aumentaSalario(percentage);
		}
		else {
			System.out.println("This id does not exist!");
		}
		
		System.out.println();
		System.out.println("List of Employees: ");
		for (Func obj : list) {
			System.out.println(obj);
		}
		
		sc.close();

	}
	
	public static boolean hasId(List<Func> list, int id) {
		Func emp = list.stream().filter(x-> x.getId() == id).findFirst().orElse(null);
		return emp !=null;
	}

}
