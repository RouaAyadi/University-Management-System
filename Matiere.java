package tp_university_management_system;
import java.util.ArrayList;

public class Matiere {
	private String id;
    private String nom;
    private Prof prof;
    private ArrayList<String> etudients;

    public Matiere(String id, String nom, Prof prof) {
        this.id = id;
        this.nom = nom;
        this.prof = prof;
        this.etudients = new ArrayList<>();
    }

    public void ajout_etudient(String etudient) {
        etudients.add(etudient);
    }
    
    public String getMatiereID() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public Prof getProf() {
        return prof;
    }
}
