import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		for (int i = 0; i < count; i++) {
			int number = sc.nextInt();

			if(isPerfectNumber(number)){
				System.out.println(1);
			} else {
				System.out.println(0);
			}
		}
		sc.close();
	}
	
	
	public static boolean isPerfectNumber(int number) {
		List<Integer> list = getFactor(number);
		int sum = 0;
		for (int num : list) {
			sum += num;
		}
		if (sum == number) {
			return true;
		}
		return false;
	}

	private static List<Integer> getFactor(int number) {

		List<Integer> fact = new ArrayList<>();
		for (int i = 1; i <= number / 2; i++) {
			if (number % i == 0) {
				fact.add(i);
			}
		}
		return fact;
	}

}
