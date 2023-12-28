package tp_university_management_system;


public class Personne {
	public String nom;
	public String prenom;
	protected String cin;
	protected int age;
	
	public Personne(String nom,String prenom,String cin,int age) {
		this.nom=nom;
		this.prenom=prenom;
		this.cin=cin;
		this.age=age;
	}
}
