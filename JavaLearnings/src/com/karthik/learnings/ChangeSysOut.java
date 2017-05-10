package com.karthik.learnings;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class ChangeSysOut {
	public static void main(String args[]) {
		try {
			System.setOut(new PrintStream(new FileOutputStream("src\\resources\\log.txt")));
			System.out.println("ChangeSysOut output is redirected here!");
		} catch(Exception e) {}
	}
}