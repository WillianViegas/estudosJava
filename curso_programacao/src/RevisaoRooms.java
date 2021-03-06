import java.util.Scanner;

import entities.Quartos;

public class RevisaoRooms {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Quartos[] room = new Quartos[10];
		
		System.out.println("How many rooms will be rented?");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n ; i++) {
			System.out.println("Rent #" + i + ":");
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.print("Email: ");
			String email = sc.next();
			
			System.out.print("Room: ");
			int numero = sc.nextInt();
			
			room[numero] = new Quartos(name, email, numero);
			System.out.println();
		}
		
		System.out.println("Busy rooms: ");
		
		for(int i = 0; i < room.length; i++) {
			if(room[i] != null) {
				System.out.println(room[i]);
			}
		}
		
		
		
		sc.close();

	}

}
