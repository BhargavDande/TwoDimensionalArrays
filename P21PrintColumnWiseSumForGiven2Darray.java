package arrays2D;

import java.util.Arrays;

public class P21PrintColumnWiseSumForGiven2Darray {
	public static void main(String[] args) {
		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println("Given array is : ");
		for (int[] arr : a) {
			System.out.println(Arrays.toString(arr));
		}
		System.out.println("-----");

		for (int i = 0; i < a.length; i++) {
			int sum = 0;
			for (int j = 0; j < a[0].length; j++) {
				sum += a[j][i];
			}
			System.out.println("Sum of " + (i + 1) + " col is : " + sum);
		}
	}
}
