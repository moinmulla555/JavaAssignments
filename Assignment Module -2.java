import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Tax Calculator");
		System.out.println("----WELCOME-----");
		
		System.out.println("Enter total Person count");
		int count=sc.nextInt();
		
		System.out.println();
		
		String[] name= new String[count];
		long [] income=new long[count];
		
		for(int i=0;i<count;i++) {
		
			System.out.println("Enter Name "+(i+1)+":");
			name[i]=sc.next();
			
			System.out.println("Enter "+ name[i] + " 's Annual Income:");
			income[i]=sc.nextLong();
			
			System.out.println();
	}
		System.out.println("Names with Liable Taxes");
		System.out.println("--------------------------");
		
		for(int j=0;j<count;j++) {
			CalculateTax(name[j], income[j]);
		}
		
	}
	
	
	public static void CalculateTax(String name,long income) {
		long tax;
		if(income >= 300000) {
			tax=income*20/100;
		}
		
		else if(income>=100000) {
			tax=income*10/100;
	     }
		else {
			tax=0;
			}
		System.out.println(""+name+":"+'\u20B9'+tax);
		
		}
}
