package homeTask_4_2;

import java.util.Scanner;

public class MaxSpan {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length of array ");
		int len=sc.nextInt();
		System.out.println("enter the elements in array");
		int n[]=new int[len];
		for(int i=0;i<len;i++)
		{
			n[i]=sc.nextInt();
		}
		int count1=0;
		int count2=0;
		for(int i=0;i<n.length;i++)
		{
			for(int j=0;j<n.length;j++)
			{
				if(n[i]==n[j])
				{
					count1=j-i+1;
					if(count1>count2)
					{
						count2=count1;
					}
				}
			}
		}
		System.out.println("The Max Span of Repeated digit in entered array is: "+count2);
	}
}
