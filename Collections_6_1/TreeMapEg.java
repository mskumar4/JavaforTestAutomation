package Collections_6_1;

import java.util.TreeMap;

public class TreeMapEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String, String> tmap = new TreeMap<String, String>();
        
        //add key-value pair to TreeMap
        tmap.put("first", "FIRST INSERTED");
        tmap.put("second", "SECOND INSERTED");
        tmap.put("third","THIRD INSERTED");
        System.out.println(tmap);
        
        if(tmap.containsKey("first")){
            System.out.println("The TreeMap contains key first");
        } else {
            System.out.println("The TreeMap does not contains key first");
        }
        if(tmap.containsKey("fifth")){
            System.out.println("The TreeMap contains key fifth");
        } else {
            System.out.println("The TreeMap does not contains key fifth");
        }
    }
	}


