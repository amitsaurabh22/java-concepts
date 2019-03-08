import java.math.BigInteger;
import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		BigInteger fact=BigInteger.ONE;
		int n = sc.nextInt();
		for(int i=2;i<=n;i++){
			fact=fact.multiply(BigInteger.valueOf(i));
		}
		System.out.println(fact);
	}

}
