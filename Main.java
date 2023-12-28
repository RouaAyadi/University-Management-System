package tp_university_management_system;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UMS universitySystem = new UMS();
        Scanner scanner = new Scanner(System.in);
        
        //ajout etudients
        universitySystem.ajoutEtudient("ahmed", "mnif","13792",21,"1");
        universitySystem.ajoutEtudient("amal", "mtar","243979",22,"2");

        // ajout profs
        universitySystem.ajoutProf("karim", "jerbi","9463",43,"3");
        universitySystem.ajoutProf("mariem", "ahmed","4543",44,"4");

        // ajout matieres
        Prof java = universitySystem.findTeacherById("3");
        Prof math = universitySystem.findTeacherById("4");
        universitySystem.ajoutMatiereProf("M1", "Introduction au poo", java);
        universitySystem.ajoutMatiereProf("M2", "transf de laplace", math);

        // ejout cours au etudients
        universitySystem.ajoutMatiereEtudient("1", "M1");
        universitySystem.ajoutMatiereEtudient("2", "M2");

        // ajout cours au profs
        universitySystem.ProfMatiere("3", "M1");
        universitySystem.ProfMatiere("4", "M2");

        // aff les matieres
        universitySystem.affMatieres("1");
        universitySystem.affMatieres("2");

        // ajouter dans la salle de lacture
        universitySystem.getSl().ajoutDansSl("1");

        // afficher les etudiants dans sl
        universitySystem.getSl().affSl();
        
        // ajout des repas au restau
        universitySystem.getRestau().ajoutRepas("kosksi");
        universitySystem.getRestau().ajoutRepas("salade");

        // affiche reaps
        universitySystem.getRestau().affRepas();

        // ajout clubs
        universitySystem.getClubs().ajoutClub("acm");
        universitySystem.getClubs().ajoutClub("ieee");

        // affiche clubs
        universitySystem.getClubs().affClubs();
    

        int choice;

        do {
            System.out.println("University Management System Menu:");
            System.out.println("1. ajout etudient");
            System.out.println("2. ajout prof");
            System.out.println("3. ajout matiere");
            System.out.println("4. donner l'etudient une matiere");
            System.out.println("5. donner le prof une matiere");
            System.out.println("6. afficher les matieres");
            System.out.println("7. ajouter un etudient dans la salle de lecture");
            System.out.println("8. afficher les etudients dans sl");
            System.out.println("9. ajout reoas au restau");
            System.out.println("10. affiche repas dispo");
            System.out.println("11. ajout Club");
            System.out.println("12. affiche clubs");
            System.out.println("0. Exit");

            System.out.print("Entez votre choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Entrer le nom de l etudient: ");
                    String nom = scanner.nextLine();
                    System.out.print("Entrer le prenom de l etudient: ");
                    String prenom = scanner.nextLine();
                    System.out.print("Entrer cin: ");
                    String cin = scanner.nextLine();
                    System.out.print("Entrer id: ");
                    String numEtudient = scanner.nextLine();
                    System.out.print("Entrer age: ");
                    int age = scanner.nextInt();
                    universitySystem.ajoutEtudient(nom,prenom,cin,age,numEtudient);
                    break;
                case 2:
                	System.out.print("Entrer nom: ");
                    String nom1 = scanner.nextLine();
                    System.out.print("Entrer prenom: ");
                    String prenom1 = scanner.nextLine();
                    System.out.print("Entrer cin: ");
                    String cin1 = scanner.nextLine();
                    System.out.print("Entrer ID: ");
                    String numProf = scanner.nextLine();
                    System.out.print("Entrer age: ");
                    int age1 = scanner.nextInt();
                    universitySystem.ajoutProf(nom1,prenom1,cin1,age1,numProf);
                    break;
                case 3:
                    System.out.print("Entrer matiere ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter nom de la matiere: ");
                    String n = scanner.nextLine();
                    System.out.print("Enter prof ID pour la matiere: ");
                    String profid = scanner.nextLine();
                    Prof p = universitySystem.findTeacherById(profid);
                    universitySystem.ajoutMatiereProf(id, n, p);
                    break;
                case 4:
                    System.out.print("Eneter etudient ID: ");
                    String id1 = scanner.nextLine();
                    System.out.print("Entrer matiere ID: ");
                    String m = scanner.nextLine();
                    universitySystem.ajoutMatiereEtudient(id1, m);
                    break;
                case 5:
                    System.out.print("Entrer prof ID: ");
                    String pr = scanner.nextLine();
                    System.out.print("Enter matiere ID: ");
                    String ma = scanner.nextLine();
                    universitySystem.ProfMatiere(pr, ma);
                    break;
                case 6:
                    System.out.print("Eneter etudient ID: ");
                    String e = scanner.nextLine();
                    universitySystem.affMatieres(e);
                    break;
                case 7:
                    System.out.print("Entrer etudient ID: ");
                    String etid = scanner.nextLine();
                    universitySystem.getSl().ajoutDansSl(etid);
                    break;
                case 8:
                	universitySystem.getSl().affSl();
                    break;
                case 9:
                    System.out.print("Entrer un repas: ");
                    String f = scanner.nextLine();
                    universitySystem.getRestau().ajoutRepas(f);
                    break;
                case 10:
                    universitySystem.getRestau().affRepas();
                    break;
                case 11:
                    System.out.print("Entrer nom du club: ");
                    String cn = scanner.nextLine();
                    universitySystem.getClubs().ajoutClub(cn);
                    break;
                case 12:
                    universitySystem.getClubs().affClubs();
                    break;
                case 0:
                    System.out.println("FIN");
                    break;
                default:
                    System.out.println("choix invalide.");
            }
        } while (choice != 0);

        scanner.close();
    }
}
