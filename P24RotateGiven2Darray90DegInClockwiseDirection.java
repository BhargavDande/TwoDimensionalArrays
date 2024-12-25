package arrays2D;

import java.util.Arrays;

public class P24RotateGiven2Darray90DegInClockwiseDirection {
	public static void main(String[] args) {
		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println("Given 2D array is : ");
		for (int[] arr : a)
			System.out.println(Arrays.toString(arr));
		// Without new Array..
		// swapping row Elements.
		int r1 = 0, r2 = a.length - 1;
		while (r1 < r2) {
			int temp[] = a[r1];
			a[r1] = a[r2];
			a[r2] = temp;
			r1++;
			r2--;
		}
		// Transpose Matrix.
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				a[i][j] = a[i][j] + a[j][i];
				a[j][i] = a[i][j] - a[j][i];
				a[i][j] = a[i][j] - a[j][i];
			}
		}
		System.out.println("After Rotate by 90deg clockwise : ");
		for (int[] arr : a)
			System.out.println(Arrays.toString(arr));
	}
}
