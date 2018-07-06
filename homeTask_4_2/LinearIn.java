package homeTask_4_2;

import java.util.Scanner;

public class LinearIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int count=0;
		Scanner sc=new Scanner(System.in);
		//Enter Super Array at Run time
		System.out.println("Please enter the length of Super array");
		int lnsup=sc.nextInt();
		int n1[]=new int[lnsup];
		System.out.println("Enter Input array elements");
		for(int i=0;i<lnsup;i++)
		{
			n1[i]=sc.nextInt();
		}
		//Enter Sub Array at Run time
		System.out.println("Please enter the length of Sub array");
		int lnsub=sc.nextInt();
		int n2[]=new int[lnsub];
		System.out.println("Enter Input array elements");
		for(int i=0;i<lnsub;i++)
		{
			n2[i]=sc.nextInt();
		}
	
	    for(int j=0;j<n2.length;j++)
	      {
		
		for(int i=0;i<n1.length;i++)
		  {
			
			if(n2[j]==n1[i])
			{	
				count++;
			}
		 }
		
		
	}
	if(count==n2.length){
		System.out.println("The sub array is  an Inner Array to Super Array ");
	}
	else
	{
		System.out.println("The sub array is NOT an Inner Array to Super Array ");
	}

}
}
