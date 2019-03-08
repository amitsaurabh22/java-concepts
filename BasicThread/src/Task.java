
public class Task implements Runnable {

	
	String command = "running the commnad ";

	Task(String command) {
		this.command = command;
	}
	@Override
	public void run() {
		System.out.println(command + " " + Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
