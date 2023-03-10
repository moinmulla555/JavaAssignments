package com.javaapp;

import java.util.Scanner;

public class Palidrome_Number {

	public static void main(String[] args) {
	
                 Scanner sc=new Scanner(System.in);

		        System.out.println("Enter Your Number");
            
		        int num=sc.nextInt();
		        int org_num=num;

		        int reverse=0;

		        while(num!=0){
		            reverse=reverse*10 +num%10;
		            num=num/10;
		        }

		        if(reverse==org_num){
		            System.out.println("Given Number is Palidrome Number");

		        }
		        else {
		            System.out.println("Given Number is not Palidrome Number");
		        }

		    }
		


	}


