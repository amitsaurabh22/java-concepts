import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ExecutorService service = Executors.newFixedThreadPool(2);
		ExecutorService service = Executors.newFixedThreadPool(nThreads, threadFactory)(2);
		service.execute(new Worker1());
		service.execute(new Worker2());
		System.out.println("hello");
	}

}
