import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int amount =sc.nextInt();
		int ways=0;
		int denaomination = sc.nextInt();
		int[] coins = new int[denaomination];
				
		for(int i=0;i<denaomination;i++){
			coins[i]=sc.nextInt();
			
		}
		while(denaomination >0){
		ways=ways+change(coins,amount,--denaomination,ways);
		}
		
		System.out.println(ways);
	}
	
	public static int change(int[] coins,int amount,int denominations,int count){
		
		int largestDeno=coins[denominations];
		int left=amount %largestDeno;
		int maxnumber=amount /coins[denominations] ;
		if(left == 0) {
			
			System.out.println("amount="+largestDeno+"X"+maxnumber);
			count++; 
		}
		
		if(amount /coins[denominations] >1 && denominations >0){
			
			change(coins,left+coins[denominations],--denominations,count) ;
			
			
		}
		
		
		return count;
	}

}
