package com.assignmentException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Q37 {
	public static void cat(File named) throws IOException {
		RandomAccessFile input = null;
		String line = null;
		try {
			input = new RandomAccessFile(named, "r");
			while ((line = input.readLine()) != null) {
				System.out.println(line);
			}
			return;
		} finally {
			if (input != null) {
				input.close();
			}
		}
	}

	public static void main(String[] args) {
	}
}
