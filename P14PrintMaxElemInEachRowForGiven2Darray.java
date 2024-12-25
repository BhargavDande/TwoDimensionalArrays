package arrays2D;

public class P14PrintMaxElemInEachRowForGiven2Darray {
	public static void main(String[] args) {
		int a[][] = { { 15, 4, 5 }, { 17, 19, 7 }, { 1, 5, 6 } };
		for (int i = 0; i < a.length; i++) {
			maxElem(a[i], i + 1);
		}
	}

	public static void maxElem(int[] arr, int index) {
		int maxElem = arr[0];
		for (int i = 0; i < arr.length; i++) {
			maxElem = arr[i] > maxElem ? arr[i] : maxElem;
		}
		System.out.println("Max Elem in " + index + " row is : " + maxElem);
	}
}
