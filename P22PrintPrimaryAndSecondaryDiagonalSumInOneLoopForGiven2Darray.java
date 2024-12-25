package arrays2D;

import java.util.Arrays;

public class P22PrintPrimaryAndSecondaryDiagonalSumInOneLoopForGiven2Darray {
	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println("Given array is : ");
		for (int[] ar : a) {
			System.out.println(Arrays.toString(ar));
		}
		int pds = 0, sds = 0;
		for (int i = 0; i < a.length; i++) {
			pds += a[i][i];
			sds += a[i][a.length - 1 - i];
		}
		System.out.println(pds);
		System.out.println(sds);
	}
}
