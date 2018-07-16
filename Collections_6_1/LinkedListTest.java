package Collections_6_1;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<CompanyList> cl=new LinkedList<CompanyList> ();
//adding data to linked list

cl.add(new CompanyList("Amazon",1,42.0));
cl.add(new CompanyList("FlipKart",2,24.0));
cl.add(new CompanyList("Snapdeal",3,14.0));
cl.add(new CompanyList("Jbong",4,10.0));
cl.add(new CompanyList("Bigbasket",5,8.0));
//Printing initial data from linked list

System.out.println("List of Companies records:");

for(CompanyList cl1: cl){
	System.out.println("Company Name: "+cl1.getName()+", Rank: "+cl1.getRank()+", Growth percent: "+cl1.getGrowthPecentage());
}
cl.addFirst(new CompanyList("AmericanEcom",1,42.1));
cl.addLast(new CompanyList("BritanRetail",6,6.0));

System.out.println("----------------------------------------------------------------------");
System.out.println("After adding First and Last records: ");
for(CompanyList cl1: cl){
	System.out.println("Company Name: "+cl1.getName()+", Rank: "+cl1.getRank()+", Growth percent: "+cl1.getGrowthPecentage());
}
CompanyList e1=new CompanyList("Krakov",3,14.0);
CompanyList e2=new CompanyList("Jack&Jills",4,13.0);
cl.add(3, e1);
System.out.println("----------------------------------------------------------------------");
System.out.println("After adding record beween existing: ");
for(CompanyList cl1: cl){
	System.out.println("Company Name: "+cl1.getName()+", Rank: "+cl1.getRank()+", Growth percent: "+cl1.getGrowthPecentage());
}

cl.removeFirst();
cl.removeLast();

System.out.println("----------------------------------------------------------------------");
System.out.println("After removing First and Last records: ");
for(CompanyList cl1: cl){
	System.out.println("Company Name: "+cl1.getName()+", Rank: "+cl1.getRank()+", Growth percent: "+cl1.getGrowthPecentage());
}

cl.remove(3);
System.out.println("----------------------------------------------------------------------");
System.out.println("After removing any existing element at 4th position: ");
for(CompanyList cl1: cl){
	System.out.println("Company Name: "+cl1.getName()+", Rank: "+cl1.getRank()+", Growth percent: "+cl1.getGrowthPecentage());
}
cl.set(3, e2);
System.out.println("----------------------------------------------------------------------");
System.out.println("After updating existing element at 4th position: ");
for(CompanyList cl1: cl){
	System.out.println("Company Name: "+cl1.getName()+", Rank: "+cl1.getRank()+", Growth percent: "+cl1.getGrowthPecentage());
}
cl.add(3, e1);
System.out.println("----------------------------------------------------------------------");
System.out.println("After adding again existing element at 4th position-duplicate: ");
for(CompanyList cl1: cl){
	System.out.println("Company Name: "+cl1.getName()+", Rank: "+cl1.getRank()+", Growth percent: "+cl1.getGrowthPecentage());
}
cl.removeLastOccurrence(e1);
System.out.println("----------------------------------------------------------------------");
System.out.println("Removing last occurance of duplicate element: ");
for(CompanyList cl1: cl){
	System.out.println("Company Name: "+cl1.getName()+", Rank: "+cl1.getRank()+", Growth percent: "+cl1.getGrowthPecentage());
}
	}
	
}
