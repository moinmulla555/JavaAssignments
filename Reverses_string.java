package com.javaapp;

public class Reverses_string {

	public static void main(String[] args) {
	
		String name="Javaprogram";
		String reverse="";
		int len=name.length();
		
		for(int i=len-1;i>=0;i--) {
			
		reverse=reverse+ name.charAt(i);
		}
 
		System.out.println("Reverse String is :"+reverse);
	}

}
