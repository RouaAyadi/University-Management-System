package tp_university_management_system;
import java.util.ArrayList;

public class Restau {
	private ArrayList<String> repas;

    public Restau() {
        this.repas = new ArrayList<>();
    }

    public void ajoutRepas(String r) {
        repas.add(r);
    }

    public void affRepas() {
        System.out.println("les repas disponibles dans le restaurant sont :");
        for (String r : repas) {
            System.out.println(r);
        }
    }
}
