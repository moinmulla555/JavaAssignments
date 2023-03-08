package com.javaapp;

public class max_element {

	public static void main(String[] args) {
		
		int[] num= {3,8,15,22,2,26};
		int max=0;
		
		for(int i=0;i<num.length;i++) {
			
			if(i==0 || max<num[i] ) {
				
				max=num[i];
			}
		}
		
		System.out.println("Maximum number is:"+ max);
 
	}

}
