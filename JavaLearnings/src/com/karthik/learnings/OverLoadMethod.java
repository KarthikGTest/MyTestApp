package com.karthik.learnings;

public class OverLoadMethod {
	
	double overloadedMethod(double d){
		return d*=d;
	}
	
	int overloadedMethod(int i){
		return overloadedMethod(i*=i);
	}
	
	float overloadedMethod(float f){
		return overloadedMethod(f*=f);
	}
	
	public static void main(String args[]){
		OverLoadMethod main = new OverLoadMethod();
		main.overloadedMethod(100);
	}

}
