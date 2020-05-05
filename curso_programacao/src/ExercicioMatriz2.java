import java.util.Scanner;

public class ExercicioMatriz2 {

	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int[][] mat = new int[x][y];
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				 mat[i][j] = sc.nextInt();
			}
		}
		
		int z = sc.nextInt();
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				
				if (mat[i][j] == z) {
					System.out.println("Position " + i + "," + j + " :");
					
					if(j > 0) {
						System.out.println("Left: " + mat[i][j - 1]);
					}
					
					if(i > 0) {
						System.out.println("Up: " + mat[i - 1][j]);
					}
					
					if(j < mat.length -1) {
						System.out.println("Right: " + mat[i][j + 1]);
					}
					
					if(i < mat.length -1) {
						System.out.println("Down: " + mat[i + 1][j]);
					}
				}
			}
			System.out.println();
		}
	}
}
