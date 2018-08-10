package Home_task_6_4;



import java.util.HashSet;
import java.util.Set;
	
	public final class HeavenlyBody {
	    private final String name;
	    private final double orbitalPeriod;
	    private final Set<HeavenlyBody> satellites;

	    public HeavenlyBody(String name, double orbitalPeriod) {
	        this.name = name;
	        this.orbitalPeriod = orbitalPeriod;
	        this.satellites = new HashSet<>();
	    }

	    public String getName() {
	        return name;
	    }

	    public double getOrbitalPeriod() {
	        return orbitalPeriod;
	    }

	    public boolean addMoon(HeavenlyBody moon) {
	        return this.satellites.add(moon);
	    }

	    public Set<HeavenlyBody> getSatellites() {
	        return new HashSet<>(this.satellites);
	    }
	    
	    //Code update by Santosh start here
	    

        public int hashCode()

        {

            System.out.println("hashcode called");

            int hashcode = 0;

           hashcode += orbitalPeriod;

            return hashcode;

        }

         

        

        public boolean equals(Object obj)

        {

            System.out.println("In equals");

            if (obj instanceof HeavenlyBody) 

            {

            	HeavenlyBody hb = (HeavenlyBody) obj;

                return (hb.name.equals(this.name) && hb.orbitalPeriod == this.orbitalPeriod);

            } else {

                return false;

            }

        }

        

        //end of code updated by Santosh

}
	



