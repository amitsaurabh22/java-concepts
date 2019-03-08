package anagram;
import java.util.Scanner;
public class Solution {
	public static int numberNeeded(String first, String second) {

		int[] firstArray = new int[26];
		int[] secondArray = new int[26];
		for (int i = 0; i < first.length(); i++) {
			int number = (int) first.charAt(i) - (int) 'a';
			firstArray[number] = firstArray[number] + 1;

		}

		for (int i = 0; i < second.length(); i++) {

			int number = (int) second.charAt(i) - (int) 'a';
			secondArray[number] = secondArray[number] + 1;

		}
		int count = 0;
		for (int i = 0; i < 26; i++) {
			count = count + Math.abs(firstArray[i] - secondArray[i]);

		}

		return count;

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.next();
		String b = in.next();
		System.out.println(numberNeeded(a, b));
	}
}
