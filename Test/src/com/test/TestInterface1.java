package com.test;

public class TestInterface1 implements TestInterface {

	private static int a2;
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("overided method");
	}
	public static void main(String args[]) {
		TestInterface test= new TestInterface1();
		test.display();
		a2 = test.a;
		System.out.println(a2);
				
	}
}
