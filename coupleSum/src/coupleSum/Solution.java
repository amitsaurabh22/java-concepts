package coupleSum;

import java.util.HashMap;

public class Solution {

	public static void main(String[] args) {
		int[] input = { 3, 4, 5, 7, 9 };
		int target = 14;
		int[] result = coupleSum(input, target);
		int[] result1 = coupleSum1(input, target);
		System.out.println("result " + result[0] + " " + result[1]);
		System.out.println("result1 " + result1[0] + " " + result1[1]);
	}

	public static int[] coupleSum(int[] numbers, int target) {
		int[] solution = new int[2];
		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i + 1; j < numbers.length; j++) {

				if (numbers[i] + numbers[j] == target) {
					solution[0] = i + 1;
					solution[1] = j + 1;
					return solution;

				}
			}
		}
		return null;
	 
	}

	public static int[] coupleSum1(int[] numbers, int target) {
		
		int[] solution = new int[2];
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<numbers.length;i++){
			if(map.containsKey(target-numbers[i])){
				solution[0] = map.get(target - numbers[i]);
				solution[1] = i + 1;
				return solution;
			} else {

				map.put(numbers[i], i + 1);
			}
		}
		return null;
	}

}
