import java.util.Scanner;

import entities.Rooms;

public class ExercicioArrayRooms {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rooms[] vect = new Rooms[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		for(int i = 0; i<n ; i++) {
			System.out.printf("Rent #%d%n", i + 1);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.nextLine();
			
			System.out.print("Room: ");
			int room = sc.nextInt();
			System.out.println();
			
			vect[room] = new Rooms(name, email, room);
		}
		
		System.out.println("Busy rooms: ");
		
		for(int i =0; i<vect.length;i++) {
			if(vect[i] != null) {
				System.out.println(vect[i]);
			}
		}
		
		sc.close();

	}

}
