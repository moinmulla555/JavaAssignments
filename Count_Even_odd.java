package com.javaapp;

import java.util.Scanner;

public class Count_Even {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Number");
		
		int num=sc.nextInt();
		
		int count_even=0;
		int count_odd=0;
		
		int Dig=0;
		
	    while(num>0) {
	    	
	    	Dig=num%10;
	    	
	    	if(Dig%2==0 ) {
	    		
	    		count_even++;

	    	}
	    	else {
	    		count_odd++;
	    	}
	    	
	    	
	    	num/=10;
	    	
	    }
	    System.out.println(" Even Count is: " +count_even);
	    System.out.println(" Odd Count is: " +count_odd);
	    
	    

	}

}
