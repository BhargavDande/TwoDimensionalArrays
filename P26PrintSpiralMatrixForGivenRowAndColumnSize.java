package arrays2D;

import java.util.Arrays;

public class P26PrintSpiralMatrixForGivenRowAndColumnSize {
	public static void main(String[] args) {
		int[][] a = new int[4][4];
		String dir = "right";
		int r = 0;
		int c = -1;
		for (int i = 1; i <= a.length * a[0].length; i++) {
			if (dir.endsWith("right")) {
				c++;
				a[r][c] = i;
				if (c == a[0].length - 1 || a[r][c + 1] != 0) {
					dir = "down";
				}
			} else if (dir.equals("down")) {
				r++;
				a[r][c] = i;
				if (r == a.length - 1 || a[r + 1][c] != 0) {
					dir = "left";
				}
			} else if (dir.equals("left")) {
				c--;
				a[r][c] = i;
				if (c == 0 || a[r][c - 1] != 0) {
					dir = "up";
				}
			} else if (dir.equals("up")) {
				r--;
				a[r][c] = i;
				if (a[r - 1][c] != 0) {
					dir = "right";
				}
			}
		}
		for (int[] arr : a) {
			System.out.println(Arrays.toString(arr));
		}
	}
}
