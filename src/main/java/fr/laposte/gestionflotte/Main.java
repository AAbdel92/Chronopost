package fr.laposte.gestionflotte;

public class Main {

	public static void main(String[] args) {

		Flotte liste = new Flotte();
		Transporteur camion1 = new Transporteur();
		liste.ajoutVehicule(camion1);
		
		camion1.setMeteo("nuit");
		camion1.setEnergie("Diesel");
		camion1.setNombreChauffeur(2);
		
		Transporteur voiture1 = new Transporteur();
		liste.ajoutVehicule(voiture1);
		voiture1.setMeteo("Jour");
		voiture1.setEnergie("Electrique");
		voiture1.setNombreChauffeur(1);
		
		Moto moto1 = new Moto();
		liste.ajoutVehicule(moto1);
		
		liste.afficherListe(camion1);
		
		
		
		

	}

}
