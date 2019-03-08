
public class Buffer {
	private int[] buffer;

	private volatile int count = 0;

	public Buffer(int n) {
		buffer = new int[n];
	}

	public synchronized void removeValue() throws InterruptedException {
		if (isEmpty()) {
			this.wait();
		}
		System.out.println("Removed from Buffer " + buffer[--count]);
		this.notify();
	}

	public synchronized void addValue(int value) throws InterruptedException {

		if (isFull()) {
			this.wait();
		}

		buffer[count++] = value;
		System.out.println("Added to Buffer " + value);
		this.notify();
	}

	public synchronized boolean isFull() {
		if (count <10){
			return false;
		}else{
			return true;
		}
	}

	public synchronized boolean isEmpty() {
		if (count < 1) {
			return true;
		} else {
			return false;
		}
	}

}
