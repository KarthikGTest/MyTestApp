package com.karthik.learnings;

import java.io.IOException;
import java.util.Scanner;

public class CandidateCode {
	/*
	 * Complete the function below.
	 */
	public static String checkLength(String input1) {
		char[] str = input1.toCharArray();
		int n = input1.length();
		int num = 0, x = 1, i = n - 1;
		for (i = n - 1; i >= 0; i--) {
			if ('0' <= str[i] && str[i] <= '9') {
				num = (str[i] - '0') * x + num;
				x = x * 10;
			} else {
				break;
			}
		}
		
		if(num==0){
			for (i = n - 1; i >= 0; i--) {
				if ('0' <= str[i] && str[i] <= '9') {
					return "Error";
				}
			}
			return "None";
		} else if (num == i + 1) {
			return "True";
		} else {
			return "False";
		}

	}

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		String output;
		String ip1 = in.nextLine().trim();
		output = checkLength(ip1);
		System.out.println(String.valueOf(output));
	}

}
