package Collections_6_1;

import java.util.HashSet;

public class HashsetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<Gadget> stock=new HashSet<Gadget>();
Gadget item1 =new Gadget(1000101,"Sony e54 head-phones",500);
Gadget item2 =new Gadget(1000102,"MI 5 pro head-phones",525);
Gadget item3=new Gadget(1000103,"Philips 5XR blutooth",600);
Gadget item4 =new Gadget(1000104,"i fit-band 433R wrist",1700);
stock.add(item1);
stock.add(item2);
stock.add(item3);
stock.add(item4);
for(Gadget i:stock){
	System.out.println("Gadget Number: "+i.gadget_id+" Gadget name: "+i.gadget_name+" Gadget Sell Price: "+((i.gadget_cost)+(i.gadget_cost)*(0.1)));
}
System.out.println("Total Gadget Stock: "+stock.size());
	}
}
