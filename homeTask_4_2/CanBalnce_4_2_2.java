package homeTask_4_2;

import java.util.Scanner;

public class CanBalnce_4_2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		int total1=0;
		int total2=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the length of array");
		int len=sc.nextInt();
		int n[]=new int[len];
		
		System.out.println("Enter Input array elements");
		for(int i=0;i<len;i++)
		{
			n[i]=sc.nextInt();
		}
		if(n.length==1){
			System.out.println(" The input array cannot be Balanced, hence the set is False");
		}
		else{
		 for(int i=0;i<n.length;i++)
		 {
			total1+=n[i];
			for(int j=n.length-1;j>i;j--)
			{
				total2+=n[j];
			}
			if(total1==total2)
			{
				System.out.println(" The input array can be Balanced, hence the set is True");
				break;
			}
			else{
				System.out.println(" The input array cannot be Balanced, hence the set is False");
				break;
			}
		 }
	}
	}
}
