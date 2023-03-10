package com.javaapp;

import java.util.Scanner;

public class Palidrome_String {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Your String");
		
		String name=sc.nextLine();
		String org_string=name;
		
		String reverse="";
		
		for(int i=name.length()-1;i>=0;i--) {
			
			reverse+=name.charAt(i);
		
		}
		
		System.out.println(reverse);
		
		if(reverse.equals(reverse)) {
			
		System.out.println("Given String is Palidrome String");
		
        }
		else {
			System.out.println("Given String is not Palidrome String");
			
		}
	}

}
