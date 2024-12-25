package arrays2D;

public class P17PrintPrimaryAndSecondaryDiagonalSumForGiven2Darray {
	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int pds = 0, sds = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (i == j) {
					pds += a[i][j];
				}
				if (i + j == a.length - 1) {
					sds += a[i][j];
				}
			}
		}
		System.out.println("Primary diagonal sum is : " + pds);
		System.out.println("Secondary diagonal sum is : " + sds);
	}
}
