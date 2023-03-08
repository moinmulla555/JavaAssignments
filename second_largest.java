package com.javaapp;

public class second_largest {

	public static void main(String[] args) {
		
		
		int[] num= {38,78,65,45,35,63};
		int temp=0;
		
           for(int i=0;i<num.length;i++) {
        	   
        	   for(int j=i+1;j<num.length;j++) {
        		   
        		   if(num[i]<num[j]) {
        			   num[i]=temp;
        			   num[i]=num[j];
        			   num[j]=temp;
        			   
        		   }
        		   
        		 
        	   }
           }
           System.out.println("Second largest number in array is :"+num[1]);
	}

}
