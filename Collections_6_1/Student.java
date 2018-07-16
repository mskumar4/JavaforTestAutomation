package Collections_6_1;

public class Student {
	public Student(String n,int s,double f,String g){
		this.name=n;
		this.grade=g;
		this.fee=f;
		this.section=s;
	}
	public String getName(){
		return name;
	}
	public String getGrade()
	{
		
		return grade;
	}
	public int getSection()
	{
		
		return section;
	}
	public double getFee()
	{
		return fee;
	}
	public double raiseFee(){
		if (grade=="A"){
			fee=fee-1000;
		}
		else if(grade=="B"){
			return fee;
		}
		else{
			fee=fee+1000;
		}
		return fee;
		
	}
	private String name;
	private int section;
	private double fee;
	private String grade;

	

}
