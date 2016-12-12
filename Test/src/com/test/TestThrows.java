package com.test;

public class TestThrows {
	
	public void testAdd(int a, int b) throws ArithmeticException{
		int c =a/b;
	}
public static void main(String args[]){
	TestThrows tT= new TestThrows();
	try {
		tT.testAdd(1, 0);
	} catch (Exception e) {
		System.out.println(e);
	}
	
}
}
