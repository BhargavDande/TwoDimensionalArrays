package arrays2D;

import java.util.Arrays;

public class P25RotateGiven2Darray90degInAntiClockWise {
	public static void main(String[] args) {
		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, };
		System.out.println("Given 2D array is : ");
		for (int[] arr : a)
			System.out.println(Arrays.toString(arr));
		int c1 = 0, c2 = a.length - 1;
		while (c1 < c2) {
			swapColElem(a, c1, c2);
			c1++;
			c2--;
		}
		// Transpose Matrix
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				a[i][j] = a[i][j] + a[j][i];
				a[j][i] = a[i][j] - a[j][i];
				a[i][j] = a[i][j] - a[j][i];
			}
		}
		System.out.println("After Rotate 2D array in Anti-clock wise : ");
		for (int arr[] : a) {
			System.out.println(Arrays.toString(arr));
		}
	}

	public static void swapColElem(int a[][], int c1, int c2) {
		for (int i = 0; i < a.length; i++) {
			int temp = a[i][c1];
			a[i][c1] = a[i][c2];
			a[i][c2] = temp;
		}
	}
}
