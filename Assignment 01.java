package com.javaapp;

import java.util.Scanner;

public class assignment {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner (System.in);
		System.out.println("enter your name ,blood group and age respectively");
		String name=sc.nextLine();
		String bloodgroup =sc.nextLine();
		int age=sc.nextInt();
		
		System.out.println("Name:"+name);
		System.out.println("age:"+age);
		System.out.println("blood group:"+bloodgroup);
		
		if(age<=20) {
			
			System.out.println("your  group is red ");
		}
		
		else if(age<=15 ||age<20) {
			System.out.println("your group is blue ");
			
		}
		
		else if(age<=10 ||age<15) {
			System.out.println("your group is yellow");
			
		}
	     
		else {
			System.out.println("you are not belong to any group");
			
		}
		
		
		
	
		
		
        
   
		
		
		
		
		
		

	}

}
