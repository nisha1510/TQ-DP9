package com.assignmentException;

import java.util.Arrays;
import java.util.Scanner;

//WAP to catch multiple exceptions. 
//i.e ArrayIndexOutOfBoundsException and ArithmeticException
public class Q03MultipleExcHandling {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int arr[] = new int[3];
			System.out.println("enter elements");
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			for (int i = 0; i <= arr.length; i++) {
				System.out.println(100 / arr[i]);
			}
		} 
//		catch (ArithmeticException e) {
//			System.out.println(e+" ArithmeticException occurs");
//		}
//		catch (ArrayIndexOutOfBoundsException e)
//		{
//			System.out.println(e+" ArrayIndexOutOfBoundsException occurs");
//		}
		
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}
		catch (Exception e) {
			System.out.println(e+" mainException");
		}
		System.out.println("rest of the code...");

	}

}
