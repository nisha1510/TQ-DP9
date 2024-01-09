package com.assignmentException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
Create a class MyClass and create three methods myMethod1(), Method2() and Method3().
Invoke Method2() from Method1() and Method3() from Method2().
Write a code that can throw an exception inside myMethod3() and compile: File file=new 
File("filename.txt"); Scanner sc=new Scanner(file). You will get compilation errors now as you are not handling a checked exception 
FileNotFoundException. Handle the exeption using try catch block
*/
public class Q28MyClass {
	
	public void myMethod1() {
        System.out.println("Inside myMethod1");
        myMethod2();
    }

    public void myMethod2() {
        System.out.println("Inside myMethod2");
        myMethod3();
    }

    public void myMethod3() {
        System.out.println("Inside myMethod3");
        try {
            File file = new File("filename.txt");
            Scanner sc = new Scanner(file);
            // Process the file
        } catch (FileNotFoundException e) {
            System.out.println(e+" FileNotFoundException caught ");
            // Handle the exception or perform necessary actions
        }
    }
    public static void main(String[] args) {
    	Q28MyClass obj = new Q28MyClass();
        obj.myMethod1();
    }
}

