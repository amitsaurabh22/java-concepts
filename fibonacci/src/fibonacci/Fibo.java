package fibonacci;
import java.math.BigInteger;
import java.util.Scanner;

public class Fibo {
	public static void main(String[] args) {
		System.out.println("enter the index n");
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		BigInteger[] fibo= new BigInteger[100];
		fibo[0] =BigInteger.ZERO ;
		fibo[1]= BigInteger.ONE;
		for (int i = 2; i < n; i++) {
			fibo[i]=fibo[i-1].add(fibo[i-2]);
		}
		System.out.println(fibo[n - 1]);
	}

}