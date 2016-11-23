package com.test;

public class Myname {

	public static void main(String args[]){
		System.out.println("this is main class");
		try {
			Thread.sleep(60*100*100);
			//amit singh
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("program done");
	}

}
