package com.exceptionhandling;

import java.util.Scanner;

public class MultiCatch2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		try {
			int arr[] = new int[3];
			System.out.println("Enter elements");
			for (int i = 0; i < arr.length; i++) {
				arr[i]=sc.nextInt();
			}
			
			System.out.println("----------");
			for (int i = 0; i <= arr.length; i++) {
				System.out.println("Value : "+100/arr[i]);
			}
		}
//		catch(Exception e) {// other catch becomes unreachable
//			System.out.println("3 : "+e);
//		}
		
		//we cannot OR exception/runtime exception
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
			System.out.println(e+" : Array element is zero");
		}
		catch(Exception e) {
			System.out.println("Other : "+e);
		}
		
	}
}
