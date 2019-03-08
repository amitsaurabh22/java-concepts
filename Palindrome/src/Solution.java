import java.util.Random;

public class Solution {

	public static void main(String[] args) {
		System.out.println(isIntPalindrome(1234321));

	}

	public static int reverse(int n) {
		int reverse =0;
		while (n > 0) {
			int lastdigit = n%10;
			n =n/10;
			reverse =reverse*10 +lastdigit;
			
		}
		return reverse;
	}

	public static Boolean isIntPalindrome(int x) {
		if (x < 0)
			return false;
		return new Random().nextBoolean();
	}

	public int findFirst(int x) {
		while (x > 10) {
			x = x / 10;
		}
		return x;

	}

	public int findLast(int x) {

		return x % 10;

	}


}

