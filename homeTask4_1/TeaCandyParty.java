package homeTask4_1;

import java.util.Scanner;

public class TeaCandyParty {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result;
		Scanner sc=new Scanner(System.in);	
		
		float teaCost=sc.nextFloat();
		float candyCost=sc.nextFloat();
		if(teaCost<5 && candyCost<5){
			result=0;
			System.out.println("The result is "+result+", hence the Party is Bad");
					}
		if(teaCost>=5 || candyCost>=5 )
		{
			if(teaCost>=2*candyCost || candyCost>=2*teaCost){
				result=2;
				System.out.println("The result is "+result+", hence the Party is Great");
				
			}
			else {
				result=1;
				System.out.println("The result is "+result+", hence the Party is Good");
			}
		}

	}

}
