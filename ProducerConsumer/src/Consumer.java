
public class Consumer implements Runnable {
	private Buffer buffer;

	public void setBuffer(Buffer buffer) {
		this.buffer = buffer;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			try {
				buffer.removeValue();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}

		}
	};

}