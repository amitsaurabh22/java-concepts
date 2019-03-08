package stack_using_array;

public class TestStack {

	public static void main(String[] args)  throws Exception{
		// TODO Auto-generated method stub
		
		Stack sc = new Stack(5);
		for(int i=0; i<5;i++){
			System.out.println(sc);
		sc.push(i);
		}
		
		System.out.println(sc);
		sc.pop();
		System.out.println(sc);
	}

}
