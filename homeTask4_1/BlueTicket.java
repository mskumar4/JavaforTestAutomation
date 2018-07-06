package homeTask4_1;

import java.util.Scanner;

public class BlueTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int a= sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
if(a+b==10 || b+c==10 || c+a==10)
{
System.out.println("The out put value is: "+10);
}
else if ((a+b)==(b+c)+10 || (a+b)==(c+a)+10 )
	
{
	System.out.println("The out put value is: "+5);
}
else{
	System.out.println("The out put value is: "+0);
}
	}

}
