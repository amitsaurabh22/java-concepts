import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {

	public static void main(String[] args) {
		 System.out.println("this is on main thread "+Thread.currentThread().getName());
		Thread thread1 = new Thread() {
            public void run() {
               System.out.println("this is on new thread "+Thread.currentThread().getName());
            }
		};
		Task task1 = new Task("Date");
		Task task2 = new Task("Time");
		Task task3 = new Task("who am i");
		Thread thread2 = new Thread(task1);
		thread1.start();
		thread2.start();

		ExecutorService executor = Executors.newFixedThreadPool(2);
		executor.execute(task2);
		executor.execute(task3);


	}



}
