package com.cisco.assignments;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Check 
{
     public static void main(String[] args) 
     {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String s1 = sc.next();
		
		String regex = "[a-z]+";
		
		Pattern pat = Pattern.compile(regex);
		Matcher match = pat.matcher(s1);
		
		if(match.matches())
		{
			System.out.println("same");
		}
		else 
		{
			System.out.println("not same");
			
		}
		
	}
}
