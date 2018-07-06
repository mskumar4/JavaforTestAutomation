package homeTask4_1;

import java.util.Scanner;

public class ShareDigit_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter two- two digit numbers");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b =sc.nextInt();
if(a>=10 && a<=99 && b>=10 && b<=99)
{
int result1=a/10;
int result2=a%10;
int result3=b/10;
int result4=b%10;
if (result1==result3 || result1==result4 || result2==result3 || result2==result4)
{
System.out.println("given set is true");
}
else
{
System.out.println("given set is false");
}
	}
else{
	System.out.println(" Entered number is not in between 10 and 99");
	}
		
	}
}
