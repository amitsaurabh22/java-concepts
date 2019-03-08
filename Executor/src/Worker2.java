
public class Worker2
		implements Runnable
{
	@Override
	public void run() {
		int count = 0;
		while (count < 10) {

			System.out.println("in side Worker2 count" + count++ + " Thread number" + Thread.currentThread().getId());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
