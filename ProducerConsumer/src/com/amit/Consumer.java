package com.amit;

public class Consumer implements  Runnable {

	RotiMaker roti;

	public RotiMaker getRoti() {
		return roti;
	}

	public void setRoti(RotiMaker roti) {
		this.roti = roti;
	}

	public Consumer(RotiMaker roti) {
		super();
		this.roti = roti;
	}



	public void run() {
		while(true){
			synchronized(roti){
				try {
					roti.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("roti consumed is "+roti.getRoti());
				roti.setRoti("");
				roti.notify();
			}
		}
	}
}	


