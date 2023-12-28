package tp_university_management_system;


public class Prof extends Personne {
	private String numProf;


    public Prof(String nom,String prenom,String cin,int age,String numProf) {
        super(nom,prenom,cin,age);
        this.numProf = numProf;
    }
    public String getProfId() {
        return numProf;
    }

    public String getNom() {
        return nom;
    }
    

}
