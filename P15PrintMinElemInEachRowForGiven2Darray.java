package arrays2D;

public class P15PrintMinElemInEachRowForGiven2Darray {
	public static void main(String[] args) {
		int a[][] = { { 15, 4, 5 }, { 17, 19, 7 }, { 1, 5, 6 } };
		for (int i = 0; i < a.length; i++) {
			minElem(a[i], i + 1);
		}
	}

	public static void minElem(int[] arr, int index) {
		int minElem = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			minElem = arr[i] < minElem ? arr[i] : minElem;
		}
		System.out.println("Min Elem in " + index + " row is : " + minElem);
	}
}
