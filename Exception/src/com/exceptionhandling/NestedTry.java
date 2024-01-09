package com.exceptionhandling;

public class NestedTry {

	public static void main(String[] args) {
		
		int arr[] = {12,0,4};
//		try 
//		{
//			for (int i = 0; i < arr.length; i++) 
//			{
//				System.out.println("Value : "+100/arr[i]);
//			}
//		
//		}
//		catch (Exception e)
//		{
//			System.out.println(e);
//		}
//3rd iteration is not execute : need to have a nested try		
		
		try 
		{
			for (int i = 0; i < arr.length; i++) 
			{
				try 
				{
					System.out.println("Value : "+100/arr[i]);
				}
				catch(ArithmeticException e)
				{
					System.out.println(e);
				}
			}
		}
		catch (Exception e)
		{
			System.out.println(e);
		}

	}
}


