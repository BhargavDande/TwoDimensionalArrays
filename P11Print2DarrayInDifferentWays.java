package arrays2D;

import java.util.Arrays;

public class P11Print2DarrayInDifferentWays {
	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		// First way
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("-------");
		// Second way
		for (int[] e : a) {
			System.out.println(Arrays.toString(e));
		}
		System.out.println("-------");
		// Third way
		for (int i = 0; i < a.length; i++) {
			System.out.println(Arrays.toString(a[i]));
		}
		System.out.println("------");
		// Fourth way
		System.out.println(Arrays.deepToString(a));
	}
}
