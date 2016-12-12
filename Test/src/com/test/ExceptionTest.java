package com.test;

public class ExceptionTest {
	
	public void isValidForVote(int age){
		try {
			if (age<18) {
				throw new InvalidAgeException("Invalid Age exception");	
			}else{
				throw new InvalidAgeException("Valid age");
				//System.out.println("Valid age");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		//return false;
	}
	public static void main(String args[]) {
		ExceptionTest excpTest = new ExceptionTest();
		excpTest.isValidForVote(17);
	}

}
