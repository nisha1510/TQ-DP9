package com.exceptionhandling;

import java.util.Scanner;

public class VotingException {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age : ");
		
		try {
			int age = sc.nextInt();
			if(age>=18)
				System.out.println("Vote");
			else
				System.out.println("cannot vote");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally {
			sc.close();
			System.out.println("in finally block: compulsary code");
		}
		System.out.println("Rest Of the code");
	}
}
