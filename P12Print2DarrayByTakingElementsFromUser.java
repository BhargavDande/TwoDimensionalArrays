package arrays2D;

import java.util.Arrays;
import java.util.Scanner;

public class P12Print2DarrayByTakingElementsFromUser {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter row size : ");
		int row = ip.nextInt();
		System.out.println("Enter col Size : ");
		int col = ip.nextInt();
		int[][] a = new int[row][col];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print("Enter elem at a[" + i + "][" + j + "] : ");
				a[i][j] = ip.nextInt();
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(Arrays.toString(a[i]));
		}
//		System.out.println(Arrays.deepToString(a));
	}
}
