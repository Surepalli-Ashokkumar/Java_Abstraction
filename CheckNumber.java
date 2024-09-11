package com.cisco.assignments;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckNumber {

	public static void main(String[] args) 
	{
		String s1 = "[987}{3}[]0-7]{7}+" ;
		String i1 = "9876537";
		
		Pattern pat = Pattern.compile(s1);
		Matcher match =pat.matcher(i1);
		
		if (match.matches()) 
		{
			System.out.println("matches your input");
		} 
		else 
		{
            System.out.println("not match with your input");
		}

	}

}
