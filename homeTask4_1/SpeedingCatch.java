package homeTask4_1;

import java.util.Scanner;

public class SpeedingCatch {
	static int result;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		boolean isBirthday=sc.nextBoolean();
		if(isBirthday){
			int speed=sc.nextInt();
			if(speed==0){
				System.out.println(" the speed shoould not be less than Zero");
			}
			if(speed>=0 && speed<=65){
				result=0;
				System.out.println("The Result is "+result+", hence no fine, Wish you happy Birthday!!");
				}
			else if(speed>65 && speed<=85){
				result=1;
				System.out.println("The Result is "+result+", hence fine with small ticket");
			}
			else {
				result=2;
				System.out.println("The Result is "+result+", hence fine with big ticket");
			}
		}
			
			else {
				int speed=sc.nextInt();
				if(speed==0){
					System.out.println(" the speed shoould not be less than Zero");
				}
				if(speed>=0 && speed<=60){
					result=0;
					System.out.println("The Result is "+result+", hence no fine");
					}
				else if(speed>60 && speed<=80){
					result=1;
					System.out.println("The Result is "+result+", hence fine with small ticket");
				}
				else {
					result=1;
					System.out.println("The Result is "+result+", hence fine with big ticket");
				}
				
			}
			

		}
	}


