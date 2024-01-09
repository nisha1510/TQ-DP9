package com.assignmentException;
//WAP which throws ArrayIndexOutBoundsException. In the console, observe the stack trace and the

//line number from where the Exception is thrown

public class Q01ArrIndexOutOfBoundExc {

	public static void main(String[] args) {

		int ar[] = { 1, 2, 3, 4, 5 };
		for (int i = 0; i <= ar.length; i++)
			System.out.println(ar[i]);
		// the array is of size 5. 
		//Therefore while accessing its element using for loop,
		//the maximum index value can be 4 i.e  < ar.length-1
	}
}
