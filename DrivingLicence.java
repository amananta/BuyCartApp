package com.sample.collect;

/******
 * 
 * Git ---> It is an repository to store our code, and
 * 			it is also used as versioning tool.
 * 
 * 
 * 
 * 
 * 
 * */


import java.util.Scanner;
// User defined Exception
// Custom Exception
public class DrivingLicence {

	static int age = 0;
	
	public static void main(String[] args) {
		System.out.println(" ***** Welcome user .... ****** ");
		
		boolean flag = checkAge();
		
		if(flag==true) {
			proceed();
		}
	}
	
	static boolean checkAge() {
		
		System.out.println("Please enter your age ::: \n");
		Scanner scr = new Scanner(System.in);
		int age = scr.nextInt();
		System.out.println("\nYour age = "+age);
		
		if(age<18) {
			throw new LessAgeException("\n *** Very less age ** \n");
		}else if(age>60) {
			throw new HigherAgeException("\n *** Very high age ** \n");
		}
		return true;
	}
	
	static void proceed() {
		System.out.println("\nEnter your vehicle verient");
		System.out.println("Enter your RTO Code");
		System.out.println("Enter your Permenent address");
	}
}

class LessAgeException extends ArithmeticException{
	public LessAgeException(String msg) {
		super(msg);
	}
}
class HigherAgeException extends NullPointerException{
	public HigherAgeException(String msg) {
		super(msg);
	}
}

