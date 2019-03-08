import java.util.concurrent.TimeUnit;


public class ShareVariable {
	
	private static volatile boolean  isChanges ;

	
	public static void main(String[] args) throws InterruptedException {
	
		
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				int count=1;

				while(!isChanges){
					System.out.println("the vlaue of is Changed is "+isChanges+" and count is "+count);
					count ++;
				}
				System.out.println("the vlaue of is Changed is "+isChanges+" and count is "+count);
				throw new NullPointerException();
			}
		});
		t.start();
		TimeUnit.SECONDS.sleep(1);
		isChanges=true;
		// TODO Auto-generated method stub

	}

}
