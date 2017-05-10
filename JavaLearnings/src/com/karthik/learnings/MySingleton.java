package com.karthik.learnings;

public class MySingleton {
	
	private static MySingleton obj;
	
	private MySingleton(){
		
	}
	
	public static MySingleton getInstance(){
		
		synchronized (MySingleton.class) {
			
			if(obj==null){
				obj= new MySingleton();
			}
			return obj;
			
		}
	}
}
