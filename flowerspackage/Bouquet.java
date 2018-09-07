package flowerspackage;
import java.util.ArrayList;
import java.util.List;


public class Bouquet {
		protected List<Flower> flowers = new ArrayList<>();
		public void add(Flower flower){
			flowers.add(flower);
		}
		public void add(int n, Flower flower){
			for(int i=0;i<n;i++){
			flowers.add(flower);
		}
		}
}

	class Jasmine extends Flower{
		public Jasmine(){
			this.cost = 10;
		}
	}

	class Lilly extends Flower{
	    public Lilly(){
	    	this.cost = 23;
		}
	}

	class Rose extends Flower{
	public Rose(){
		this.cost = 4;
		}
	}

