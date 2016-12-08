package com.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Formatter;

public class DateFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat sd= new SimpleDateFormat("MMM dd,yyyy");
		String date= "May 1,2015";
		
		try {
			Date date1= sd.parse(date);
			System.out.println(sd.format(date1));
			System.out.println(date1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
