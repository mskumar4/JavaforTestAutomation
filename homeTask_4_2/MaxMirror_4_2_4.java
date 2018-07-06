package homeTask_4_2;

import java.util.Scanner;

public class MaxMirror_4_2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the length of array");
		int ln=sc.nextInt();
		int n[]=new int[ln];
		System.out.println("Enter Input array elements");
		for(int i=0;i<ln;i++)
		{
			n[i]=sc.nextInt();
		}
		int initial = 0;
		int len = 0;
		int max = 0;
		boolean flag = true;

		for (int i = 0; i < n.length; i++) {
		initial = i;
		if(n.length == 1)
		{
		max = 1;
		break;
		}
		for (int j = n.length - 1; j > 0; j--) {

		if (n[i] == n[j]) 
		{
		if (j == 0 || i == n.length - 1 || j == i) 
		{
		break;
		}
		flag = true;
		len = 1;
		while (flag) {
		if (j == 0 || i == n.length - 1) {
		break;
		}
		if (n[i + 1] == n[j - 1]) 
		{
		len++;
		++i;
		--j;

		if (max < len)
		max = len;
		}
		else
		{
		flag = false;
		i = initial;

		}
		}
		}
		}
		}

	System.out.println("The max mirror from Input array is: "+max);

		}
	

}

