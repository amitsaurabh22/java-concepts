import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args) {
		
	Deque<Character> stack = new LinkedList<Character>();

	Scanner sc =new Scanner(System.in);
	char[] input =sc.nextLine().toCharArray();
	int size=input.length;
	if(size %2 == 1){
		System.out.println("False");
		return;
	
	}
	for (int i=0;i<size;i++){
		if((input[i] == '{' ) || (input[i] == '[' ) || (input[i] == '(' )){
			stack.addFirst(input[i]);
		} else{
			if((stack.getFirst() == ']') && (input[i] !='[')){
				System.out.println("False");
				return;
			}
			if((stack.getFirst() == ')') && (input[i] !='(')){
				System.out.println("False");
				return;
			}
			if((stack.getFirst() == '}') && (input[i] !='{')){
				System.out.println("False");
				return;
			}
			stack.removeFirst();
		}
		
	}
	System.out.println("True");
	
	}

}

