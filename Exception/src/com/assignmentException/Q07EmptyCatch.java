package com.assignmentException;
//WAP to check can we have an empty catch block?
public class Q07EmptyCatch {

	public static void main(String[] args) {
		try
		{
			int a = 10;
			System.out.println(a/0);
		}catch (Exception e) {
			System.out.println(e);
		}
	}

}
