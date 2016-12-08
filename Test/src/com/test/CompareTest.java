package com.test;

public abstract class CompareTest implements Comparable<String>{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="amit";
		String b="ait";
		
		int value= a.compareTo(b);
		System.out.println("Value"+ value);

	}


	

}
