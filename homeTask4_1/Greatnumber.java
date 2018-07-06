package homeTask4_1;

import java.util.Scanner;

public class Greatnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
boolean result;
if ( a==6 || b==6 || a+b==6 || a-b==6)
{
	result=true;
	System.out.println(result);
}
else {
	result=false;
	System.out.println(result);
}
	}

}
