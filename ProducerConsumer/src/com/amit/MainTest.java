package com.amit;

public class MainTest {

	public static void main(String[] args) {
		RotiMaker rotiHolder = new RotiMaker();
		rotiHolder.setRoti("this is intilizer");
		Producer p = new Producer(rotiHolder);
		Consumer c = new Consumer(rotiHolder);
		Thread producer = new Thread(p) ;
		Thread consumer = new Thread(c) ;
		producer.start();
		consumer.start();

	}

}
