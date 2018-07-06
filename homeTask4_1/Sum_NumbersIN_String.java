package homeTask4_1;

import java.util.Scanner;

public class Sum_NumbersIN_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
int num=0;
String str1="";
for(int i=0;i<str.length();i++)
{
	if(Character.isDigit(str.charAt(i)))
	{
	if(i<str.length()-1 && Character.isDigit(str.charAt(i+1)))
	{
		str1+=str.charAt(i);
	}
	else
	{
		str1=str1+str.charAt(i);
		num=num+Integer.parseInt(str1);
		str1="";
	}
}
	}

System.out.println(num);
}
}