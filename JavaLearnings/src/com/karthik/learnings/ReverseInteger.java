package com.karthik.learnings;

public class ReverseInteger {
	public int reverseNumber(int number) {

		int reverse = 0;
		while (number != 0) {
			reverse = (reverse * 10) + (number % 10);
			number = number / 10;
		}
		return reverse;
	}

	public static void main(String a[]) {
		ReverseInteger nr = new ReverseInteger();
		System.out.println("Result: " + nr.reverseNumber(17868));
	}
}