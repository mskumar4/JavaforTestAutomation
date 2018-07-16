package Collections_6_1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap hm=new HashMap();
hm.put(10001, 12000);
hm.put(10002, 13000);
hm.put(10003, 14000);
hm.put(10004, 15000);
hm.put(10005, 16000);

Set group=hm.entrySet();
Iterator i=group.iterator();

while(i.hasNext()){
	Map.Entry data=(Map.Entry) i.next();
	System.out.println(data.getKey()+": "+data.getValue());
}

hm.remove(10005, 16000);
System.out.println("--------------------------------------");
System.out.println("Removing an Entry and Update balance to any existing account" );
Iterator i1=group.iterator();
while(i1.hasNext()){
	Map.Entry data=(Map.Entry) i1.next();
	int bal=(int) data.getValue();
	if(bal<=12000){
		bal=bal+1000;
	}
	System.out.println(data.getKey()+": "+bal);
}

	}

}
