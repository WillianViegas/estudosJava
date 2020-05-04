import java.util.Scanner;

public class exercicioMatriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int c = sc.nextInt();
		int l = sc.nextInt();
		
		int[][] mat = new int[c][l];
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j< l; j++) {
				mat[i][j] = sc.nextInt();
			}
 		}

		for(int i =0; i<mat.length;i++) {
			for(int j = 0; j< mat.length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		
		int x = sc.nextInt();
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat.length; j++) {
				if(mat[i][j] == x) {
					System.out.println("Position " + i + ", " + j + ":");
					
					if(j > 0) {
						System.out.println("Left: "+ mat[i][j - 1]);
					}
					
					if(i > 0) {
						System.out.println("Up: " + mat[i - 1][j]);
					}
					
					if(j < mat[i].length -1) {
						System.out.println("Right: " + mat[i][j + 1]);
					}
					
					if(i < mat.length -1) {
						System.out.println("Down: " + mat[i + 1][j]);
					}
					System.out.println();
					
				}
			}
		}
		
		sc.close();
		}

	}

