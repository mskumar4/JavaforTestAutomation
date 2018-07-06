package homeTask_4_2;

import java.util.Scanner;

public class CountClump_4_2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the length of array");
		int len=sc.nextInt();
		int n[]=new int[len];
		System.out.println("Enter Input array elements");
		int count=0;
		boolean flag=false;
		for(int i=0;i<len;i++)
		{
			n[i]=sc.nextInt();
		}
		for(int i=0;i<n.length-1;i++)
		{
			if(n[i]==n[i+1] && !flag)
			{
				count++;
				flag=true;
			}
			else if(n[i]!=n[i+1]){
				flag=false;
				
			}
		}
		System.out.println(count);
	}

}
