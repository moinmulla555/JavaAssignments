package com.javaapp;

public class Min_element {

	public static void main(String[] args) {
		
		int[] myarray= {44,78,56,23,89,30};
		
		int min=0;
		
		for(int i=0;i<myarray.length;i++) {
			
			if(i==0 ||min>myarray[i]) {
				
				min=myarray[i];
			}
		}

		System.out.println("Minimum number in array is :"+min);
}
}
