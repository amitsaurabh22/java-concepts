
public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buffer b = new Buffer(10);
		Producer p = new Producer();
		p.setBuffer(b);
		Thread tp1 = new Thread(p);
		Thread tp2 = new Thread(p);
		tp1.start();
		tp2.start();
		Consumer c = new Consumer();
		c.setBuffer(b);
		Thread tc1 = new Thread(c);
		Thread tc2 = new Thread(c);
		tc1.start();
		tc2.start();

	}

}
