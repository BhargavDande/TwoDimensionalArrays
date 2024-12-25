package arrays2D;

public class P16PrintMaxElemInEachRowForGiven2Darray {
	public static void main(String[] args) {
		int a[][] = { { 15, 4, 5 }, { 17, 19, 7 }, { 1, 5, 6 } };
		for (int i = 0; i < a.length; i++) {
			int max = Integer.MIN_VALUE;
			for (int j = 0; j < a[i].length; j++) {
				max = a[j][i] > max ? a[j][i] : max;
			}
			System.out.println((i + 1) + " column Max Elem is : " + max);
		}
	}
}
