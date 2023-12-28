package tp_university_management_system;
import java.util.ArrayList;

public class Etudient extends Personne {
	private String numEtudient;
    private ArrayList<String> matieres;


    public Etudient(String nom,String prenom,String cin,int age,String numEtudient) {
        super(nom,prenom,cin,age);
        this.numEtudient=numEtudient;
        this.matieres = new ArrayList<>();

    }

    public void ajout_classe(String m) {
        matieres.add(m);
    }
    
    public void affiche_matieres() {
        System.out.println("les matieres que " + nom + " (ID: " + numEtudient + ") etudie sont :");
        for (String m : matieres) {
            System.out.println(m);
        }
    }
    public String getEtudientId() {
        return numEtudient;
    }

    public String getNom() {
        return nom;
    }
    
   

    // Other relevant methods like viewGrades, payFees, etc.
}
