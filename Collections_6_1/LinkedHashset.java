package Collections_6_1;

import java.util.LinkedHashSet;

public class LinkedHashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedHashSet<String> name_set=new LinkedHashSet<String>();
name_set.add("John");
name_set.add("Fletcher");
name_set.add("Kirill");
name_set.add("Kowing");
//Adding same Record again to Linked Hash Set , will not add duplicate record
name_set.add("John");
System.out.println(" Record Set"+name_set);
System.out.println("Size of the Set: "+name_set.size());
System.out.println("Set Contains Kirill: "+name_set.contains("Kirill"));
System.out.println("Set Contains Johncena : "+name_set.contains("Johncena"));
name_set.remove("Kowing");
System.out.println("-----------------------------------------------");

System.out.println("Updated Record Set: "+name_set);
System.out.println("Size of the Set: "+name_set.size());
System.out.println("Set Contains Kirill: "+name_set.contains("Kirill"));
System.out.println("Set Contains Kowing : "+name_set.contains("Kowing"));

	}

}
