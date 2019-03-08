import java.util.concurrent.TimeUnit;


public class ShareVariableFix {
	
	private static  boolean  isChanged ;
	
	public static synchronized void  setIsChanged(boolean value){
		isChanged=value;
		
	}
	
	
	public static synchronized boolean getChanged(){
		return isChanged;
	}

	
	public static void main(String[] args) throws InterruptedException {
	
		
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				int count=1;
				while(!getChanged()){
					System.out.println("the vlaue of is Changed is "+isChanged+" and count is "+count);
					count ++;
				}
				System.out.println("the vlaue of is Changed is "+isChanged+" and count is "+count);
			}
		});
		t.start();
		TimeUnit.SECONDS.sleep(1);
		setIsChanged(true);
		// TODO Auto-generated method stub

	}

}
