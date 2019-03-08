package com.amit;

public class Producer implements  Runnable {

	RotiMaker roti;

	public RotiMaker getRoti() {
		return roti;
	}

	public void setRoti(RotiMaker roti) {
		this.roti = roti;
	}


	public Producer(RotiMaker rotiHolder) {
		super();
		this.roti = rotiHolder;
	}

	public void run() {
		int i=0;
		try {
		while(true){
			
			Thread.sleep(2000);
			synchronized(roti){
			
		
					roti.setRoti("this is roti number is "+i++);
					System.out.println("roti produced by "+roti.getRoti());
					roti.notify();
					
				
				

			} 

		}
	
	}catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}	


