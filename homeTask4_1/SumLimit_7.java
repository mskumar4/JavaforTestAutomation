package homeTask4_1;
import java.util.Scanner;

public class SumLimit_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
String str1=String.valueOf(a);
String str2=String.valueOf(b);
String str3=String.valueOf(a+b);
if(str3.length()>str1.length()){
	System.out.println("The value is : "+a);
}
else{
	System.out.println("the sum of two numbers is :"+(a+b));
}
	}

}
