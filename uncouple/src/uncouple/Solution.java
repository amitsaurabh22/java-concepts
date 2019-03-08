package uncouple;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution {
	
	public static void main(String[] args) {
		
	Set<String> unclouble = new HashSet<String>();

	Scanner sc =new Scanner(System.in);
	String input= sc.nextLine();
	String[] inputval = null;
	inputval = input.split(", ");
	for (int i=0;i<inputval.length;i++){
		
			if(!unclouble.add(inputval[i])){
				
				unclouble.remove(inputval[i]);
			}
		
	}
	for (String string : unclouble) {
		
	
	System.out.println(string);
		
	}
	}

}

