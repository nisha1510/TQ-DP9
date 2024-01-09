package com.exceptionhandling;

public class FirstExceptionHandling2 {

	public static void main(String[] args) {
		int arr[] = {1,2,3};
		try {
			for (int i = 0; i <= arr.length; i++) {
				System.out.println(arr[i]);
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		System.out.println("Code ends...");
	}
}
