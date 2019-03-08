package deadlock;

public class A {
	private Object keyA = new Object();
	private Object keyB = new Object();

	public void methodA1() {

		synchronized (keyA) {
			System.out.println("exectuing methodA1 from thread " + Thread.currentThread());
			methodB1();
		}
	}

	public void methodB1() {
		synchronized (keyB) {
			System.out.println("exectuing methodB1 from thread " + Thread.currentThread());
			methodA2();
		}
	}

	public void methodA2() {
		synchronized (keyA) {
			System.out.println("exectuing  methodA2 from thread " + Thread.currentThread());
		}
	}

}
