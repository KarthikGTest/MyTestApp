package com.karthik.learnings;

import java.io.Serializable;

public class SerializationTest implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4204175063120634153L;
	int a;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
	public static void main(String args[]){
		System.out.println("1843576572204081264L 4204175063120634153L");
	}
	

}
