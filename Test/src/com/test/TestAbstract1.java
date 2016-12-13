package com.test;

public class TestAbstract1 extends TestAbstract{

	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("overided method");
	}
	public static void main(String args[]) {
		TestAbstract test =new TestAbstract1();
		test.display();
		test.test();
	}
	
	
	
}
