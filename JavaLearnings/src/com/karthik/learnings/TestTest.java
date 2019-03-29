package com.karthik.learnings;

class Fish{
	String name="fish";
	void eat(){
		System.out.println("fish");
	}
}
class Fish1 extends Fish{
	String name="fish1";
	void eat(){
		System.out.println("fish1");
	}
}

public class TestTest {
	public static void main(String args[]) {

		Fish f= new Fish1();
		System.out.println(f.name);
		f.eat();

	}
}
