package homeTask4_1;

import java.util.Scanner;

public class Bok_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean result;
		
Scanner sc=new Scanner(System.in);
boolean bok=sc.nextBoolean();
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
if (bok){
if(c>a){
	result=true;
	System.out.println("the Result is "+result);
}
else{
	result=false;
	System.out.println("the Result is "+result);
}

	}
else {
	if(b>a && c>a){
		result=true;
		System.out.println("the Result is "+result);
	}
	else{
		result=false;
		System.out.println("the Result is "+result);
	}
		
	}
}

}
