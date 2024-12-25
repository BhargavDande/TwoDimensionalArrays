/*Write a Java program to determine if a given 2D square matrix is a magic square. 
 A magic square is defined as a square matrix where the sum of every row,
 column, and both diagonals is the same.*/

package arrays2D;

public class P30PrintMagicSquareMatrixOrNot {
	public static int pdsSds(int a[][]) {
		int pds = 0, sds = 0;
		for (int i = 0; i < a.length; i++) {
			pds += a[i][i];
			sds += a[i][a.length - 1 - i];
		}
		return pds == sds ? pds : -1;
	}

	public static boolean rowSum(int[][] a, int ds) {
		for (int i = 0; i < a.length; i++) {
			int sum = 0;
			for (int j = 0; j < a.length; j++) {
				sum += a[i][j];
			}
			if (sum != ds) {
				return false;
			}
		}
		return true;
	}

	public static boolean colSum(int[][] a, int ds) {
		for (int i = 0; i < a.length; i++) {
			int sum = 0;
			for (int j = 0; j < a[i].length; j++) {
				sum += a[j][i];
			}
			if (sum != ds) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[][] a = { { 2, 9, 4 }, { 7, 5, 3 }, { 6, 1, 8 } };
		int ds = pdsSds(a);
		if (ds != -1) {
			if (rowSum(a, ds)) {
				if (colSum(a, ds)) {
					System.out.println("Magic Square Matrix..");
				} else {
					System.out.println("COl sum is Differ NMS.");
				}
			} else {
				System.out.println("RowSum is differ NMS.");
			}
		} else {
			System.out.println("Diagonal Sum is Differ NMS.");
		}
	}
}
