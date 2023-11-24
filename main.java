public class main{
	public static void main(String[] args) {
		Hopital hopital = new Hopital();

		Medecin medecin1 = new Medecin(1, "Dr. oussema", "dhib", 001);
		Medecin medecin2 = new Medecin(1, "Dr. dhib", "oussema ", 002);

		Patient patient1 = new Patient(001, "oussema", "dhib", 0001);
		Patient patient2 = new Patient(013, "oussema", "akkari", 0002);
		Patient patient3 = new Patient(014, "oussema", "ben zdira", 0003);


		hopital.ajouterMedecin(medecin1);
		hopital.ajouterMedecin(medecin2);

		hopital.ajouterPatient(medecin1, patient1);
		hopital.ajouterPatient(medecin2, patient2);
		hopital.ajouterPatient(medecin2, patient3);


		hopital.afficherMap();
	    }
}

