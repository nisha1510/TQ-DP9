package com.assignmentException;

import java.io.IOException;

public class Q17ThrowsKeyWordExample {

	public static void main(String[] args) {
		try {
			readFile();
		} catch (IOException e) {
			System.out.println("Exception caught: " + e.getMessage());
		}
	}

	public static void readFile() throws IOException {

		throw new IOException("File not found.");
	}
}

