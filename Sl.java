package tp_university_management_system;
import java.util.ArrayList;

public class Sl {
	private int capacite;
    private ArrayList<String>etudientsDansSl;

	
    public Sl(int capacite) {
        this.capacite = capacite;
        this.etudientsDansSl = new ArrayList<>();

    }

    
	/*public int getCapacite() {
	        return capacite;
	    }*/

    public void ajoutDansSl(String id) {
        if (capacite > 0) {
        	etudientsDansSl.add(id);
            capacite--;
            System.out.println("l'etudient " + id + " est dans la salle de lacture.");
            //return true;
        } else {
            System.out.println("la salle de lecture est pleine");
            //return false;
        }
    }
    
    public void affSl() {
        System.out.println("les etudiants dans la salle de lecture sont :");
        for (String s : etudientsDansSl) {
            System.out.println(s);
        }
    }
}
