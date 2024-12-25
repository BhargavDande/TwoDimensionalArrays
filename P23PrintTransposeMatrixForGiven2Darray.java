package arrays2D;

import java.util.Arrays;

public class P23PrintTransposeMatrixForGiven2Darray {
	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		System.out.println("Given 2D Arr : ");
		for (int arr[] : a)
			System.out.println(Arrays.toString(arr));
//		 without creating new Array..
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				int temp = a[i][j];
				a[i][j] = a[j][i];
				a[j][i] = temp;
			}
		}
		System.out.println("After Transpose : ");
		for (int arr[] : a)
			System.out.println(Arrays.toString(arr));
	}
}
