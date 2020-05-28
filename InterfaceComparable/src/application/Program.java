package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		String path = "C:\\Users\\willi\\Documents\\aula.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			String employeeCSV = br.readLine();
			while(employeeCSV != null) {
				String[] vet = employeeCSV.split(",");
				String name = vet[0];
				double salary = Double.parseDouble(vet[1]);
				list.add(new Employee(name, salary));
				name = br.readLine();
			}
			Collections.sort(list);
			for(Employee x : list) {
				System.out.println(x.getName() + ", " + x.getSalary());
			}
		}
		catch(IOException e) {
			System.out.println("Error:" + e.getMessage());
		}
	}

}
