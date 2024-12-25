package arrays2D;

import java.util.Arrays;

public class P13PrintMaxAndMinElemInGiven2Darray {
	public static void main(String[] args) {
		int[][] a = { { 15, 2, 4 }, { 17, 19, 7 }, { 1, 5, 6 } };
		System.out.println("Given 2D Arr is : " + Arrays.deepToString(a));
		int maxElem = a[0][0];
		int minElem = a[0][0];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				minElem = a[i][j] < minElem ? a[i][j] : minElem;
				maxElem = a[i][j] > maxElem ? a[i][j] : maxElem;
			}
		}
		System.out.println("Max elem is : " + maxElem);
		System.out.println("Min elem is : " + minElem);
	}
}
