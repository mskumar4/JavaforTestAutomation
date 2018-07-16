package Collections_6_1;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedHashMap<String,String> lhm=new LinkedHashMap<String,String>();
lhm.put("SportGoods", "SportCheck");
lhm.put("Apparel","Marks");
lhm.put("RetailGoods","Atmosphere");
lhm.put("Accessories", "SportExperts");
System.out.println(lhm);
System.out.println("--------------------------------------------------");
System.out.println("The Banner for Sport Goods is : "+lhm.get("SportGoods"));
lhm.remove("Accessories");
System.out.println("--------------------------------------------------");
System.out.println("The records at likedhashMap set are: "+lhm);
System.out.println("--------------------------------------------------");
System.out.println("Is data contains Atmosphere: "+lhm.containsKey("RetailGoods"));
System.out.println("The Size of linked hasmap is: "+lhm.size());
	}

}
