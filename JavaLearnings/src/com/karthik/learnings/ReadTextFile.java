package com.karthik.learnings;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile {

	public static void main(String args[]) {

		String fileName = "src\\resources\\Lines.txt";

		try {

			File file = new File(fileName);

			BufferedReader b = new BufferedReader(new FileReader(file));

			String readLine = "";

			System.out.println("Reading file using Buffered Reader");

			while ((readLine = b.readLine()) != null) {
				System.out.println(readLine);
			}
			b.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
