
public class Worker1
		implements Runnable
{
	@Override
	public void run() {
		int count = 0;
		while (count < 10) {

			System.out.println("in side woker1 count" + count++ + " Thread number" + Thread.currentThread().getId());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
