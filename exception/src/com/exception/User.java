package com.exception;
import java.lang.Exception;

public class User {
	
	private static String  uid=getUserId();
	
	public User(String id) {
		
		this.uid =id;
	}

	private static String getUserId()  {
		int b=5;
		int c=0;
		int a= b/c;
		return "";
	}

}
