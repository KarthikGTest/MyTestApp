package com.karthik.learnings;

public class IntegerTest {
	
	public static void main(String args[]){
		
		int a=500,b=500;
		Integer c=128,d=128;
		System.out.println(a==b);
		System.out.println(c==d);
		
		c=127;d=127;
		System.out.println(c==d);
		
		int e=50,f=50;
		Integer g=50,h=50;
		System.out.println(e==f);
		System.out.println(g==h);
		
		int findsum=12345;
		int sum=0;
		for(char ch:String.valueOf(findsum).toCharArray()){
			sum=sum+Character.getNumericValue(ch);
		}
		System.out.println(sum);
		
		
		System.out.println(Integer.parseInt("10"));
		//System.out.println(Integer.parseInt("10 ")); //With space or character will throw exception
	}

}
