package testbreak;

public class Test {
	public int localVar;

	public Test() {
		System.out.println("Test");
		localVar = 5;

	}

	public Test(int val) {
		System.out.println("Test arg");
		this();
		localVar = val;

	}

	public static void main(String args[]) {
		new Test();
	}

}
