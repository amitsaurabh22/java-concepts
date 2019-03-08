package deadlock;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		A a = new A();
		Runnable rA = new Runnable() {
			@Override
			public void run() {
				a.methodA1();

			}
		};

		// same thing using lamda expression
		Runnable rB =()->a.methodB1();
		Thread tA = new Thread(rA);
		Thread tB = new Thread(rB);
		tA.start();
		tB.start();

	}

}
