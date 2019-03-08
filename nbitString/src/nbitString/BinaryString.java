package nbitString;

public class BinaryString {
	static int A[] = new int[3];

	public static void main(String[] args) {
		Binary(3);
	}

	private static void Binary(int n) {
		if(n<1){
			System.out.print(A[0]);
			System.out.print(A[1]);
			System.out.println(A[1]);
		}else{
			
			A[n-1]=0;
			Binary(n-1);
			A[n-1]=1;
			Binary(n-1);		
		}
	}
}
