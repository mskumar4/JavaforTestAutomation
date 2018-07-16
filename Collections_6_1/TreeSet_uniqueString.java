package Collections_6_1;

import java.util.TreeSet;

public class TreeSet_uniqueString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        String[] Names = {"Johny","Tommy","Lino","chirec","chirec","Adam","Chirec"};
	        TreeSet<String> unique_set = new TreeSet<String>();
			for(String record:Names){
	            if(!unique_set.add(record)){
	                System.out.println("Duplicate Entry is: "+record);
	            }
	        }
	    }
		
	}


