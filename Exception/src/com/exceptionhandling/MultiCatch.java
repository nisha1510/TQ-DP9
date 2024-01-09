package com.exceptionhandling;

import java.util.Scanner;

public class MultiCatch {

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
		catch(ArithmeticException e){
//			System.out.println(e);
			System.out.println(e+" : Array element is zero");
		}
		catch(ArrayIndexOutOfBoundsException e) {
	//		System.out.println(e);
			System.out.println(e+" : array is iterated to greater index");
		}
		catch(Exception e) {
			System.out.println("3 : "+e);
		}
		
	}
}
