package ransam;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
	Map<String, Integer> magazineMap = new HashMap<>();
	String magazine;
	String note;

	public Solution(String magazine, String note) {

		this.magazine = magazine;
		this.note = note;
	}

	public boolean solve() {

		String[] mag = magazine.split(" ");
		String[] not = note.split(" ");
		for (int i = 0; i < mag.length; i++) {
			Integer value = magazineMap.get(mag[i]);
			if (value != null) {
				magazineMap.put(mag[i], value + 1);
			} else {
				magazineMap.put(mag[i], 1);
			}

		}

		for (int i = 0; i < not.length; i++) {
			Integer value = magazineMap.get(not[i]);

			if (value != null && value.compareTo(0) > 0) {
				magazineMap.put(not[i], value - 1);

			} else {

				return false;
			}

		}
		return true;

	}

    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// int m = scanner.nextInt();
		// int n = scanner.nextInt();

		// Eat whitespace to beginning of next line
		// scanner.nextLine();

		Solution s = new Solution(scanner.nextLine(), scanner.nextLine());
		scanner.close();

		boolean answer = s.solve();
		if (answer)
			System.out.println("Yes");
		else
			System.out.println("No");

	}
}
