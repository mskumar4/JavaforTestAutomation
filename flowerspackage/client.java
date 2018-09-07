package flowerspackage;

public class client {

	public static void main(String[] args) {

		Bouquet boquet = new Bouquet();
		boquet.add(new Rose());
		boquet.add(new Jasmine());
		boquet.add(new Lilly());
		boquet.add(10, new Rose());
	
	}
}

