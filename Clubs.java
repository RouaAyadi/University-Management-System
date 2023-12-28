package tp_university_management_system;
import java.util.ArrayList;

public class Clubs {
	 private ArrayList<String> clubs;

	    public Clubs() {
	        this.clubs = new ArrayList<>();
	    }

	    public void ajoutClub(String c) {
	        clubs.add(c);
	    }

	    public void affClubs() {
	        System.out.println("les clubs de l'universite sont :");
	        for (String c : clubs) {
	            System.out.println(c);
	        }
	    }
}
