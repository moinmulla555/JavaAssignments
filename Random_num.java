package com.javaapp;

import java.util.Random;

public class Random_num {

	public static void main(String[] args) {
		
	    Random rand =new Random();
		int randnum = rand.nextInt(100);
 		
	    System.out.println(randnum);
		
	     //using Math.random
		System.out.println(Math.random()); 
		

	}

}
