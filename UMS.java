package tp_university_management_system;
import java.util.ArrayList;

public class UMS {
	private ArrayList<Etudient> etudients;
    private ArrayList<Prof> profs;
    private ArrayList<Matiere> matieres;
    private Sl sl;
    private Restau restau;
    private Clubs clubs;

    public UMS() {
        this.etudients = new ArrayList<>();
        this.profs = new ArrayList<>();
        this.matieres = new ArrayList<>();
        this.sl = new Sl(100);
        this.restau = new Restau();
        this.clubs = new Clubs();
    }

    public void ajoutEtudient(String nom,String prenom,String cin,int age,String numEtudient) {
        Etudient et = new Etudient(nom,prenom,cin,age,numEtudient);
        etudients.add(et);
        System.out.println(nom + " est ajoute.");
    }

    public void ajoutProf(String nom,String prenom,String cin,int age,String numProf) {
        Prof p = new Prof(nom,prenom,cin,age,numProf);
        profs.add(p);
        System.out.println(nom + " est ajoute.");
    }

    public void ajoutMatiereProf(String courseID, String name, Prof teacher) {
        Matiere m = new Matiere(courseID, name, teacher);
        matieres.add(m);
        System.out.println("la matiere " + name + " est etudiee par " + teacher.getNom());
    }

    public void ajoutMatiereEtudient(String id, String mid) {
        Etudient s = findStudentById(id);
        Matiere c = findCourseById(mid);

        if (s != null && c != null) {
            c.ajout_etudient(id);
            s.ajout_classe(mid);
            System.out.println(s.getNom() + " etudie la matiere " + c.getNom());
        } else {
            System.out.println("non trouve.");
        }
    }

    public void ProfMatiere(String id, String mid) {
        Prof p = findTeacherById(id);
        Matiere m = findCourseById(mid);

        if (p != null && m != null) {
            m = new Matiere(m.getMatiereID(), m.getNom(), p);
            System.out.println("le professeur " + p.getNom() + " est de la matiere " + m.getNom());
        } else {
            System.out.println("non trouve.");
        }
    }

    public void affMatieres(String id) {
        Etudient e = findStudentById(id);
        if (e != null) {
            e.affiche_matieres();
        } else {
            System.out.println("non trouve.");
        }
    }

    public Sl getSl() {
        return sl;
    }

    public Restau getRestau() {
        return restau;
    }

    public Clubs getClubs() {
        return clubs;
    }

    public Etudient findStudentById(String id) {
        for (Etudient e : etudients) {
            if (e.getEtudientId().equals(id)) {
                return e;
            }
        }
        return null;
    }

    public Prof findTeacherById(String id) {
        for (Prof p : profs) {
            if (p.getProfId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    public Matiere findCourseById(String id) {
        for (Matiere m : matieres) {
            if (m.getMatiereID().equals(id)) {
                return m;
            }
        }
        return null;
    }
    
}
