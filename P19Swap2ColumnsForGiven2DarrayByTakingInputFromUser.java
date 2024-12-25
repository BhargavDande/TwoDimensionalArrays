package arrays2D;

import java.util.Arrays;
import java.util.Scanner;

public class P19Swap2ColumnsForGiven2DarrayByTakingInputFromUser {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int[][] a = { { 1, 2, 3, 10 }, { 4, 5, 6, 11 }, { 7, 8, 9, 12 } };
		System.out.println("Given array is : ");
		for (int[] arr : a) {
			System.out.println(Arrays.toString(arr));
		}
		System.out.println("-----");
		System.out.println("enter column 1 to swap : ");
		int c1 = ip.nextInt();
		System.out.println("Enter column 2 to swap : ");
		int c2 = ip.nextInt();
		if (c1 >= 0 && c1 < a[0].length && c2 >= 0 && c2 < a[0].length) {
			for (int i = 0; i < a.length; i++) {
				int temp = a[i][c1];
				a[i][c1] = a[i][c2];
				a[i][c2] = temp;
			}
			System.out.println("After swapping : ");
			for (int arr[] : a) {
				System.out.println(Arrays.toString(arr));
			}
		} else {
			System.out.println("Invalid column indexes..");
		}
	}
}
