package arrays2D;

public class P27BeautifulDirection {
	public static void main(String[] args) {
		String[] mov = { "right", "left", "right", "down", "right", "down" };
		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int r = 0, c = 0;
		for (int i = 0; i < mov.length; i++) {
			String dir = mov[i];
			if (dir.equals("right")) {
				if (c >= 0 && c < a[0].length - 1) {
					c++;
				}
			} else if (dir.equals("left")) {
				if (c > 0 && c < a[0].length) {
					c--;
				}
			} else if (dir.equals("down")) {
				if (r >= 0 && r < a.length - 1) {
					r++;
				}
			} else if (dir.equals("up")) {
				if (r > 0 && r < a.length) {
					r--;
				}
			}
		}
		System.out.println(a[r][c]);
	}
}
