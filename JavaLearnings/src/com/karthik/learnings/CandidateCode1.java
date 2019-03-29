package com.karthik.learnings;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CandidateCode1 {
	/*
	 * Complete the function below.
	 */
	public static void main(String args[]) throws Exception {

		Scanner in = new Scanner(System.in);
		String input = in.nextLine().trim();
		validateProducts(input);

	}

	public static String validateProducts(String input1) {
		String[] products = input1.split(";");
		StringBuilder finalstring = new StringBuilder();
		for (int i = 0; i < products.length; i++) {
			String[] pro = products[i].split(" ");
			if (pro.length < 3) {
				return "INVALID";
			} else if (Integer.parseInt(pro[2]) < 0) {
				return "ERROR";
			} else if (pro[1].split("-").length < 3) {
				return "INVALID";
			} else {
				finalstring.append(pro[0] + " ");
				SimpleDateFormat dt = new SimpleDateFormat("dd-MMM-yyyy");

				Date localDate = null;
				try {
					localDate = dt.parse(pro[1]);
				} catch (ParseException e) {
					e.printStackTrace();
				}

				finalstring.append(dt.format(localDate)).append(" ");

				if (localDate.before(Calendar.getInstance().getTime())) {
					pro[2] = "0";
					finalstring.append(pro[2] + " " + "Expired");

				} else {
					finalstring.append(pro[2] + " " + "Non-expired");
				}

				if (i != products.length - 1) {
					finalstring.append(";");
				}
			}
		}

		return finalstring.toString();
	}
}