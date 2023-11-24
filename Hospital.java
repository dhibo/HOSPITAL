import java.util.Map;
import java.util.TreeMap;

public class Hopital {
    public Map<Medecin, ListPatients> medecinPatients;

    public Hopital() {
        medecinPatients = new TreeMap<>();
    }

    public void ajouterMedecin(Medecin m) {
        medecinPatients.put(m, new ListPatients());
    }

    public void ajouterPatient(Medecin m, Patient p) {
        if (medecinPatients.containsKey(m)) {
            if (!medecinPatients.get(m).rechercherPatient(p)) {
                medecinPatients.get(m).ajouterPatient(p);
            }
        } else {
            ListPatients patients = new ListPatients();
            patients.ajouterPatient(p);
            medecinPatients.put(m, patients);
        }
    }

    public void afficherMap() {
        medecinPatients.forEach((medecin, patients) -> {
            System.out.println("Medecin: " + medecin);
            patients.afficherPatients();
        });
    }

    public void afficherMedcinPatients(Medecin m) {
        System.out.println("Patients du medecin " + m.getNom() + " : ");
        medecinPatients.get(m).afficherPatients();
    }

 }
