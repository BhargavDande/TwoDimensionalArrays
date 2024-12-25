package arrays2D;

import java.util.Arrays;

public class P28SortGiven2DarrayRowWise {
	public static void main(String[] args) {
		int[][] a = { { 5, 1, 3, 4 }, { 9, 6, 10, 8 }, { -5, 3, 2, -1 }, { 10, 15, -5, 16 } };
		System.out.println("Given Arr is : ");
		for (int[] ar : a)
			System.out.println(Arrays.toString(ar));
		for (int[] arr : a) {
			bubbleSort(arr);
		}
		System.out.println("Result Arr is : ");
		for (int[] ar : a)
			System.out.println(Arrays.toString(ar));
	}

	public static void bubbleSort(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
	}
}
