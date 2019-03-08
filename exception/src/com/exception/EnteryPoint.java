package com.exception;

import java.util.ArrayList;
import java.util.List;

public class EnteryPoint {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		List<User> users = new ArrayList<User>(2);
		System.out.println("before user class object creation");
		for (int i=0;i<2;i++) {
		try {
			users.add(new User(String.valueOf(i)));
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		System.out.println("after user class object creation"); 
		
		
	}

}
