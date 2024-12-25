package arrays2D;

import java.util.Arrays;
import java.util.Scanner;

public class P18Swap2RowsForGiven2DarrayByTakingInputFromUser {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println("Given array is : ");
		for (int[] arr : a) {
			System.out.println(Arrays.toString(arr));
		}
		System.out.println("-----");
		System.out.println("Enter first row index to swap : ");
		int r1 = ip.nextInt();
		System.out.println("Enter second row index to swap : ");
		int r2 = ip.nextInt();
		if (r1 >= 0 && r1 < a.length && r2 >= 0 && r2 < a.length) {
			for (int i = 0; i < a.length; i++) {
				int temp = a[r1][i];
				a[r1][i] = a[r2][i];
				a[r2][i] = temp;
			}
			System.out.println("swapped row wise array is : ");
			for (int[] arr : a) {
				System.out.println(Arrays.toString(arr));
			}
		} else {
			System.out.println("Invalid row indexes..");
		}
	}
}
