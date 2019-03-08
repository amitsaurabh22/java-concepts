
public class RaceCondition {

	public static void main(String[] args) throws InterruptedException {
		LongWrapper longWarpper = new LongWrapper(0L);
		Runnable r = new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 1_000; i++) {
					// longWarpper.incrementValue();
					// longWarpper.incrementValueSynchronized();
					longWarpper.incrementValueSyncUsingObjectKey();
				}

			}
		};
		Thread[] threads = new Thread[1_000];
		for (int i = 0; i < 1_000; i++) {
			threads[0] = new Thread(r);
			threads[0].start();
		}

		for (int i = 0; i < 1_000; i++) {
			threads[0].join();
		}

		System.out.println("Value =" + longWarpper.getValue());

	}

}
