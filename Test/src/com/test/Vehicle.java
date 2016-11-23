package com.test;

 class Vehicle1 {

	public Vehicle1() {
		// TODO Auto-generated constructor stub
		System.out.println("A ka constructor");
	}

}
class B extends Vehicle1{
	
	public B() {
		// TODO Auto-generated constructor stub
		System.out.println("B ka constructor");
	}
}
class C extends B{
	
	public C() {
		// TODO Auto-generated constructor stub
		System.out.println("C ka constructor");
	}
}
class Vehicle{
	public static void main(String args[]) throws InterruptedException{
		
		Vehicle1 a=new C();
		System.out.println("sleeping");
		Thread.currentThread().setName("Amit");
		Thread.sleep(60*6100*100);
		System.out.println("program done");
	}
}