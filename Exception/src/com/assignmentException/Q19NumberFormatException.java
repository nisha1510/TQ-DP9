package com.assignmentException;
//WAP to show the scenario in which number-format exception is generated and handle this exception.
public class Q19NumberFormatException {
/*A NumberFormatException occurs when you try to convert a string into a numeric format, 
like int or double, but the string is not a valid representation of a number.*/
	public static void main(String[] args) {
		try 
		{
			String str = "Hello";
			int num = Integer.parseInt(str);
			System.out.println(num);
		}
		catch (NumberFormatException e) {
			System.out.println(e+" NumberFormatException occurs");
		}
		catch (Exception e)
		{
			System.out.println(e);
		}

	}

}
