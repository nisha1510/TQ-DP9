package com.assignmentException;

import java.io.IOException;

//WAP to show checked parent exception is first and child exception is second in which case 
//compilation error is seen

class Parent2 {
	int data;

	// throws checked exception
	void printData() throws IOException {
		System.out.println(data);
	}
}
class Child2 extends Parent2{
	
	void printData() throws IOException {
		System.out.println(data);
	}
}
public class Q25CheckedParentExc {

}
