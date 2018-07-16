package Collections_6_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Student> s=new ArrayList<Student>();
s.add(new Student("Yaswant", 6, 10000, "A"));
s.add(new Student("Mayan", 7, 15000, "A"));
s.add(new Student("Kalyan", 6, 10000, "B"));
s.add(new Student("Sushanth", 8, 18000, "B"));
s.add(new Student("Jagan", 6, 10000, "C"));


for(Student s1: s){
	System.out.println("Student Name: "+s1.getName()+", Section: "+s1.getSection()+", Annual Fee: "+s1.getFee()+", Grade: "+s1.getGrade()+", updated fee: "+s1.raiseFee());
}
// remove some records
s.remove(0);
System.out.println(" The List after removing a record:");
for(Student s1: s){
	
	System.out.println("Student Name: "+s1.getName()+", Section: "+s1.getSection()+", Annual Fee: "+s1.getFee()+", Grade: "+s1.getGrade()+", updated fee: "+s1.raiseFee());
}
	}

}
