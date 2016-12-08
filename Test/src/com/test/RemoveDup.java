package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDup {

	public static void main(String[] args) {
		
			// TODO Auto-generated method stub
		String[] data= {"A","B","C","A"};
		System.out.println("String Data"+ Arrays.toString(data));
		
		List<String> list= Arrays.asList(data);
		System.out.println(list);
		Set<String> set= new  HashSet<String>(list);
		System.out.println(set);
		

	}

}
