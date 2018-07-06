package homeTask4_1;

import java.util.Scanner;

public class WithoutString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String str1=sc.nextLine();
String str2=sc.nextLine();
String str3;
str3=str1.replace(str2,"");
System.out.println(str3);
}
}