package homeTask4_1;

import java.util.Scanner;

public class Max_Block {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
String str1=sc.nextLine();
int count=0;
int count1=1;
for(int i=0;i<str1.length();i++)
{
	
	if(i<(str1.length()-1) && str1.charAt(i)==str1.charAt(i+1))
	{
	count1++;
	}
	else{
		count1=1;
	}
	if (count1 > count)
		      count =count1;

	}
	

System.out.println(count);
	}

}
