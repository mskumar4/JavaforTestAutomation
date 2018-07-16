package Collections_6_1;

public class CompanyList {
	public CompanyList(String compName,int rank,double growthPercent){
		this.compName=compName;
		this.rank=rank;
		this.growthPercentage=growthPercent;
	}
	public String getName(){
		return compName;
		
	}
	public int getRank(){
		return rank;

	}
	public double getGrowthPecentage(){
		return growthPercentage;
	}
	private String compName;
	private int rank;
	private double growthPercentage;

}
