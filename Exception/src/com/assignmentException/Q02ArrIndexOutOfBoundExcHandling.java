package com.assignmentException;
//WAP to use catch / handle the ArrayIndexOutOfBoundsException exception
public class Q02ArrIndexOutOfBoundExcHandling {

	public static void main(String[] args) {
		int arr[] = {1,2,3};
		try 
		{
			for (int i = 0; i <= arr.length; i++) 
			{
				System.out.println(arr[i]);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		System.out.println("Code ends...");
	}
}
